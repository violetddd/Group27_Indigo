package com.example.INFS3605.Fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;

import com.example.INFS3605.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MusicFragment extends Fragment {
    ImageView play, prev, next, imageView, btn_music;
    TextView songTitle;
    SeekBar mSeekBarTime, mSeekBarVol;
    static MediaPlayer mMediaPlayer;
    private Runnable runnable;
    private AudioManager mAudioManager;
    int currentIndex = 0;
    BottomNavigationView bottomNavigationView;
    Fragment selectedFragment = null;

    public MusicFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_music, container, false);

        mAudioManager = (AudioManager) getContext().getSystemService(Context.AUDIO_SERVICE);
        play = view.findViewById(R.id.play);
        prev = view.findViewById(R.id.prev);
        next = view.findViewById(R.id.next);
        songTitle = view.findViewById(R.id.songTitle);
        imageView = view.findViewById(R.id.imageView);
        mSeekBarTime = view.findViewById(R.id.seekBarTime);
        mSeekBarVol = view.findViewById(R.id.seekBarVol);



        final ArrayList<Integer> songs = new ArrayList<>();

        songs.add(0, R.raw.australian_ancestry_proud_music_preview);
        songs.add(1, R.raw.corporate_kit_mainloop_long_proud_music_preview);
        songs.add(2, R.raw.heavens_above_proud_music_preview);
        songs.add(3, R.raw.how_do_you_didgeridoo_proud_music_preview);
        songs.add(4, R.raw.sounds_traveller_philip_drummy_proud_music_preview);
        songs.add(5,R.raw.tribal_earth_philip_drummy_proud_music_preview);



        mMediaPlayer = MediaPlayer.create(getContext().getApplicationContext(), songs.get(currentIndex));


        int maxV = mAudioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curV = mAudioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        mSeekBarVol.setMax(maxV);
        mSeekBarVol.setProgress(curV);

        mSeekBarVol.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSeekBarTime.setMax(mMediaPlayer.getDuration());
                if (mMediaPlayer != null && mMediaPlayer.isPlaying()) {
                    mMediaPlayer.pause();
                    play.setImageResource(R.drawable.play_btn);
                } else {
                    mMediaPlayer.start();
                    play.setImageResource(R.drawable.pause);
                }

                songNames();

            }
        });


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mMediaPlayer != null) {
                    play.setImageResource(R.drawable.pause);
                }

                if (currentIndex < songs.size() - 1) {
                    currentIndex++;
                } else {
                    currentIndex = 0;
                }

                if (mMediaPlayer.isPlaying()) {
                    mMediaPlayer.stop();
                }

                mMediaPlayer = MediaPlayer.create(getContext().getApplicationContext(), songs.get(currentIndex));

                mMediaPlayer.start();
                songNames();

            }
        });


        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mMediaPlayer != null) {
                    play.setImageResource(R.drawable.pause);
                }

                if (currentIndex > 0) {
                    currentIndex--;
                } else {
                    currentIndex = songs.size() - 1;
                }
                if (mMediaPlayer.isPlaying()) {
                    mMediaPlayer.stop();
                }

                mMediaPlayer = MediaPlayer.create(getContext().getApplicationContext(), songs.get(currentIndex));
                mMediaPlayer.start();
                songNames();

            }
        });

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
        mMediaPlayer.pause();
    }


    private void songNames() {
            if (currentIndex == 0) {
                songTitle.setText("Australian Ancestry Proud Music");
                imageView.setImageResource(R.drawable.australian_ancestry);
            }
            if (currentIndex == 1) {
                songTitle.setText("Corporate Kit Mainloop");
                imageView.setImageResource(R.drawable.coorporate_kit);
            }
            if (currentIndex == 2) {
                songTitle.setText("Heavens Above");
                imageView.setImageResource(R.drawable.heavens_above);
            }
            if (currentIndex == 3) {
                songTitle.setText("How Do You Didgeridoo");
                imageView.setImageResource(R.drawable.how_do_you);
            }
            if (currentIndex == 4) {
                songTitle.setText("Sounds Traveller - Philip Drummy");
                imageView.setImageResource(R.drawable.sounds_traveller);
            }
            if (currentIndex == 5) {
                songTitle.setText("Tribal Earth");
                imageView.setImageResource(R.drawable.tribal_earth);
            }


            // seekbar duration
            mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    mSeekBarTime.setMax(mMediaPlayer.getDuration());
                    mMediaPlayer.start();
                }
            });

            mSeekBarTime.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    if (fromUser) {
                        mMediaPlayer.seekTo(progress);
                        mSeekBarTime.setProgress(progress);
                    }
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });

            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (mMediaPlayer != null) {
                        try {
                            if (mMediaPlayer.isPlaying()) {
                                Message message = new Message();
                                message.what = mMediaPlayer.getCurrentPosition();
                                handler.sendMessage(message);
                                Thread.sleep(1000);
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }

        @SuppressLint("Handler Leak")
        Handler handler = new Handler () {
            @SuppressLint("HandlerLeak")
            @Override
            public void handleMessage  (Message msg) {
                mSeekBarTime.setProgress(msg.what);
            }
        };
    }
