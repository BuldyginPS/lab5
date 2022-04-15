package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView MyvideoPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyvideoPlayer = findViewById(R.id.MyvideoPlayer);
        Uri myVideoUri = Uri.parse("android.resource://"+ getPackageName() +"/"+R.raw.videoplayback);
        MyvideoPlayer.setVideoURI(myVideoUri);
        MediaController mediaController = new MediaController(this);
        MyvideoPlayer.setMediaController(mediaController);
        mediaController.setMediaPlayer(MyvideoPlayer);



        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyvideoPlayer.start();
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyvideoPlayer.pause();
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyvideoPlayer.stopPlayback();
                MyvideoPlayer.resume();
            }
        });
    }

}