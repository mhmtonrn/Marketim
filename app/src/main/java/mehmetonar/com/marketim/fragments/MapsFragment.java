package mehmetonar.com.marketim.fragments;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import mehmetonar.com.marketim.R;
import mehmetonar.com.marketim.data.AddPhotoBottomDialogFragment;
import mehmetonar.com.marketim.data.LocationHelper;
import mehmetonar.com.marketim.util.GPSManager;


@SuppressLint("ValidFragment")
public class MapsFragment extends Fragment {

    //Component Declaration


    //declaration
    public Context mContext;
    public MapView mMapView;
    private GoogleMap googleMap;


    public MapsFragment(Context c) {
        this.mContext = c;
        startGetLocation();
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_maps, container, false);

        mMapView = (MapView) view.findViewById(R.id.map);
        mMapView.onCreate(savedInstanceState);
        mMapView.onResume(); // needed to get the map to display immediately



        return view;
    }



    @Override
    public void onStart() {
        super.onStart();
        startGetLocation();
    }

    @Override
    public void onPause() {
        super.onPause();

    }

    @Override
    public void onResume() {
        super.onResume();
        startGetLocation();
    }

    private void getMapView(MapView mMapView, final LatLng location) {

        Log.i("MyLocation", location.toString());
        if (location.toString().equals("lat/lng: (0.0,0.0)")){
          startGetLocation();
        }

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                MapsFragment.this.googleMap= googleMap;
                googleMap.getUiSettings().setZoomGesturesEnabled(true);
                //googleMap.getUiSettings().setZoomControlsEnabled(true);=>+- buttons
                if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                    return;
                }
                googleMap.setMyLocationEnabled(true);
                Log.i("location:",String.valueOf(location.longitude));
                LatLng currentLocation = new LatLng(location.latitude,location.longitude);

                //fiil the map markers
                getMarker();


                float zoomLevel = (float) 12.0;
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(currentLocation, zoomLevel));
                CameraPosition cameraPosition = new CameraPosition.Builder().target(currentLocation).zoom(zoomLevel).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

                googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                    @Override
                    public boolean onMarkerClick(Marker marker) {
                        Log.i("Tag","tsg");
                        AddPhotoBottomDialogFragment addPhotoBottomDialogFragment = new AddPhotoBottomDialogFragment(getContext(),marker);
                        addPhotoBottomDialogFragment.show(getFragmentManager(),"add_photo_dialog_fragment");



                        return true;
                    }
                });

            }
        });



    }


    private void getMarker() {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    LocationHelper locationHelper = new LocationHelper();
                    ArrayList<LatLng> locationList = locationHelper.getMarkerLocation();

                    for (LatLng latLng:locationList){
                        MarkerOptions markerOptions = new MarkerOptions();
                        markerOptions.position(latLng);
                        markerOptions.title("Marker Başlık");
                        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
                        googleMap.addMarker(markerOptions);

                    }


                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).run();
    }


    public LatLng getLocation() {
        GPSManager gpsManager  = new GPSManager(mContext);
        double latitu = gpsManager.getLatitude();
        double longtitu = gpsManager.getLongitude();
        LatLng currentLocation = new LatLng(latitu,longtitu);
        return currentLocation;
    }

    private void startGetLocation() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    getLocation();
                    getMapView(mMapView,getLocation());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).run();
    }



}
