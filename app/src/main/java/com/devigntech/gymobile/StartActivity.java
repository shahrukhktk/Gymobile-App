package com.devigntech.gymobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;

import com.devigntech.gymobile.TrainerAppFiles.Trainer_Authentication.Trainer_SignUp;
import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;

public class StartActivity extends AppCompatActivity
{
    private SwipeButton trainer, client;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //TO REMOVE THE NOTIFICATION BAR FROM SPLASH SCREEN
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        trainer = (SwipeButton) findViewById(R.id.swipe_as_trainer_ID);
        client = (SwipeButton) findViewById(R.id.swipe_as_client_ID);

        trainer.setOnStateChangeListener(new OnStateChangeListener()
        {
            @Override
            public void onStateChange(boolean active)
            {
                startActivity(new Intent(getApplicationContext(), Trainer_SignUp.class));
            }
        });

        client.setOnStateChangeListener(new OnStateChangeListener()
        {
            @Override
            public void onStateChange(boolean active)
            {

            }
        });

    }
}
