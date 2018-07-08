package mehmetonar.com.marketim.start;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.net.InetAddress;

import mehmetonar.com.marketim.LayoutMainActivity;
import mehmetonar.com.marketim.R;
import mehmetonar.com.marketim.util.GPSManager;

public class SplashActivity extends AppCompatActivity {

    private Intent splashIntent;
    private Handler handler;
    private LinearLayout layout;
    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        layout = findViewById(R.id.splashLayout);
        splashIntent = new Intent(SplashActivity.this, LayoutMainActivity.class);

        handler = new Handler();


    }

    @Override
    protected void onStart() {
        super.onStart();
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);


    }

    private void splashScreen(final int i) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(splashIntent);
                finish();
            }
        }).run();
    }

    private boolean isNetworkConnected() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);

        return cm.getActiveNetworkInfo() != null;
    }

    public boolean isInternetAvailable() {
        try {
            InetAddress ipAddr = InetAddress.getByName("https://www.google.com/");

            return !ipAddr.equals("");

        } catch (Exception e) {
            return false;
        }

    }


    @Override
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
        if (requestCode == 1) {
            onStart();

        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Log.i("permissin string list: ", "permissin string list: " + grantResults);

        switch (requestCode) {
            case 1: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    goStart();
                } else {
                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }
            // other 'case' lines to check for other
            // permissions this app might request
        }
    }

    private void goStart() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isInternetAvailable() || isNetworkConnected()) {
                    locationManager = (LocationManager) getApplicationContext().getSystemService(LOCATION_SERVICE);


                    boolean isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
                    if (isGPSEnabled) {

                        startActivity(splashIntent);

                        finish();
                    } else {
                        showSettingsAlert();

                    }

                } else {
                    Snackbar snackbar = Snackbar
                            .make(layout, R.string.net_fail_message, Snackbar.LENGTH_INDEFINITE).setAction(R.string.open_net, new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent intent = new Intent(Settings.ACTION_WIRELESS_SETTINGS);
                                    startActivityForResult(intent, 1);
                                }
                            });
                    snackbar.show();
                }

            }
        }, 5000);
    }


    public void showSettingsAlert() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        //Setting Dialog Title
        alertDialog.setTitle("GPS is settings");

        //Setting Dialog Message
        alertDialog.setMessage("GPS is not enabled.Do you want to go to settings menu?");

        //On pressing Settings button
        alertDialog.setPositiveButton("Settings", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivityForResult(intent, 1);

            }
        });

        //On pressing cancel button
        alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }

        });

        //Showing Alert Message
        alertDialog.show();

    }
}
