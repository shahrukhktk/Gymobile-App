package com.devigntech.gymobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;

public class StartActivity extends AppCompatActivity
{
    private SwipeButton trainer, client;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        trainer = (SwipeButton) findViewById(R.id.swipe_as_trainer_ID);
        client = (SwipeButton) findViewById(R.id.swipe_as_client_ID);

        trainer.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {

            }
        });

        client.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {

            }
        });

    }
}
