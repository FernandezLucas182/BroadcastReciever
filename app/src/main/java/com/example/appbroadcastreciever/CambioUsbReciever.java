package com.example.appbroadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CambioUsbReciever extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        boolean usbConectado = intent.getBooleanExtra("connected", false);
                if(usbConectado){
                    Toast.makeText(context, "El Usb se conecto", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context, "El Usb se desconecto", Toast.LENGTH_SHORT).show();
                }
    }
}