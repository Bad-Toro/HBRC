package com.mac.training.brc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Fernando on 12/8/2016.
 */

public class FTR extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, intent.getStringExtra("K"), Toast.LENGTH_SHORT).show();
        Intent i = new Intent(context, MainActivity.class);
        i.putExtra("Key", intent.getStringExtra("K"));
        context.startActivity(i);
    }
}
