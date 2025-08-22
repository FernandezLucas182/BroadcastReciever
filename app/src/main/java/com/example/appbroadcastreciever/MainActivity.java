package com.example.appbroadcastreciever;

import android.content.IntentFilter;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private CambioUsbReciever eventoUsb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eventoUsb = new CambioUsbReciever();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        registerReceiver(eventoUsb, new IntentFilter("android.hardware.usb.action.USB_STATE"));
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(eventoUsb);
    }
}