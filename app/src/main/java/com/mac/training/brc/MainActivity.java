package com.mac.training.brc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tV;
    FTR ftR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV = (TextView) findViewById(R.id.textView) ;
        Intent i = getIntent();
        if (i != null){
            tV.setText(i.getStringExtra("Key"));
        }
        ftR = new FTR();


    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter iF = new IntentFilter();
        iF.addAction("com.mac.training.br2.MyAction");
        registerReceiver(ftR, iF);
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(ftR != null){
            unregisterReceiver(ftR);
        }
    }

}
