package com.example.jarvis.wifier;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button enablebtn, disablebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enablebtn = (Button) findViewById(R.id.enableWifi);
        disablebtn = (Button) findViewById(R.id.disbleWifi);


        enablebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wmn = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                wmn.setWifiEnabled(true);
            }
        });


        disablebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wmn = (WifiManager) getSystemService(Context.WIFI_SERVICE);
                wmn.setWifiEnabled(false);
            }
        });
    }
}
