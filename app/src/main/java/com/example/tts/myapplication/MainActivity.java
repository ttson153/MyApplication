package com.example.tts.myapplication;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("hello-jni");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FrameLayout mainLayout = (FrameLayout) findViewById(R.id.activity_main);
        ClippingImageView animatingImageView = new ClippingImageView(this);
        animatingImageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.photo_w));
        mainLayout.addView(animatingImageView);

    }

    public native String stringFromJNI();
}
