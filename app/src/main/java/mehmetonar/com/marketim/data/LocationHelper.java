package mehmetonar.com.marketim.data;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

public class LocationHelper {

    public ArrayList<LatLng> getMarkerLocation(){
        List<LatLng> markerList = new ArrayList<>();
        markerList.add(new LatLng(40.72939739873268,29.2016827539186));
        markerList.add(new LatLng(40.70939739873268,29.2216827539186));
        markerList.add(new LatLng(40.71939739873268,29.2296827539186));
        markerList.add(new LatLng(40.72739739873268,29.2011827539186));
        markerList.add(new LatLng(40.72139739873268,29.2096827539186));
        markerList.add(new LatLng(40.929202720341294,29.301394854743183));
        markerList.add(new LatLng(40.929292720341294,29.301354854743183));

        return (ArrayList<LatLng>) markerList;
    }
}
