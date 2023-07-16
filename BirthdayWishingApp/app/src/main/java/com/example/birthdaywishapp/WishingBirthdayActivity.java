package com.example.birthdaywishapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

public class WishingBirthdayActivity extends AppCompatActivity {
    public static final String USER_NAME = "name";
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishing_birthday);

        String name = getIntent().getStringExtra(USER_NAME);
        TextView textView = findViewById(R.id.BirthdayGreeting);
        textView.setText("Happy Birthday "+name);

        //Playing background music.
        mediaPlayer = MediaPlayer.create(this, R.raw.song2);
        mediaPlayer.setLooping(true);
        mediaPlayer.start();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}