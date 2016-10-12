package com.usjr.finalsexam.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.usjr.finalsexam.R;
import com.usjr.finalsexam.fragments.PlayVideoFragment;

public class PlayVideoActivity extends AppCompatActivity {

    private PlayVideoFragment mPlayVideoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);

        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("VID_ID")) {
            throw new RuntimeException("PlayVideoActivity should accept a VID_ID passed as Intent argument");
        }

        String videoId = intent.getStringExtra("VID_ID");
        mPlayVideoFragment = PlayVideoFragment.newInstance(videoId);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, mPlayVideoFragment, "PlayVideo")
                .commit();
    }
}
