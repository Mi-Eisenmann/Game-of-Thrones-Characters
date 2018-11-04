package com.example.android.got;

import android.content.Context;
import android.media.MediaPlayer;

public class MediaPlayerHandler {
    private static MediaPlayer mMediaPlayer;

    private static MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener(){
        @Override
        public void onCompletion(MediaPlayer mp){
            releaseMediaPlayer();
        }
    };

    public static void handler(Context activityContext, int uri) {

        releaseMediaPlayer();
        mMediaPlayer = MediaPlayer.create(activityContext, uri);
        mMediaPlayer.start();
        mMediaPlayer.setOnCompletionListener(mCompletionListener);

    }

    private static void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }
}