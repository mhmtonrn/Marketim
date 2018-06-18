package mehmetonar.com.marketim.start;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.net.InetAddress;

import mehmetonar.com.marketim.LayoutMainActivity;
import mehmetonar.com.marketim.R;

public class SplashActivity extends AppCompatActivity {

    private Intent splashIntent;
    private Handler handler;
    private LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        layout = findViewById(R.id.splashLayout);
        splashIntent = new Intent(SplashActivity.this, LayoutMainActivity.class);
        //splashScreen(6000);
        handler = new Handler();

    }

    @Override
    protected void onStart() {
        super.onStart();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                if (isInternetAvailable()||isNetworkConnected()){
                    startActivity(splashIntent);
                    finish();
                }else {
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
        },3000);
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
        if (requestCode==1){
            onStart();

        }
    }
}
