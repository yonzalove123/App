package com.example.sportapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class FootballVDO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_vdo);

        String id = "";
        Bundle extras = getIntent().getExtras();
        if (extras != null) id = extras.getString("ID");

        VideoView vdo = findViewById(R.id.videoView);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.output1;

        Uri u = Uri.parse(videoPath);
        vdo.setVideoURI(u);
        vdo.start();

        MediaController mediaController = new MediaController(this);
        vdo.setMediaController(mediaController);
        mediaController.setAnchorView(vdo);

        Button btn = (Button) findViewById(R.id.back4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FootballVDO.this, Home.class);
                startActivity(intent);

            }
        });

        }
    }

