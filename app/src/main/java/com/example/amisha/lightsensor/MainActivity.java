package com.example.amisha.lightsensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements SensorEventListener {
MediaPlayer mp;
    Sensor s;
    SensorManager sm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp=MediaPlayer.create(this,R.raw.a);
        sm=(SensorManager)getSystemService(SENSOR_SERVICE);
        s=sm.getDefaultSensor(Sensor.);
        sm.registerListener(this,s,SensorManager.SENSOR_DELAY_NORMAL);




            }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if(event.values[0]>5)
        {mp.start();

        }

        else
        {mp.pause();

        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}



