package com.devigntech.gymobile.TrainerAppFiles.Trainer_Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import com.devigntech.gymobile.R;

public class Trainer_Login extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //TO REMOVE THE NOTIFICATION BAR FROM SPLASH SCREEN
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer__login);
    }
}
