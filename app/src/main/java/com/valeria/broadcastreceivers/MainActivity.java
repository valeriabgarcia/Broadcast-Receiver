package com.valeria.broadcastreceivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.OrientationEventListener;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarNornalBroadcast(View view) {
        Intent intent = new Intent(this, PrimeiroReceiver.class);
        sendBroadcast(intent);
    }
}