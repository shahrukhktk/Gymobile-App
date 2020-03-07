package com.devigntech.gymobile.TrainerAppFiles.Trainer_Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.devigntech.gymobile.R;

public class Trainer_SignUp extends AppCompatActivity
{
    private EditText trainerName, trainerEmail, trainerPassword, trainerConfirmPswrd;
    private Button registerAccountBtn;
    private TextView alreadyMemberBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //TO REMOVE THE NOTIFICATION BAR FROM SPLASH SCREEN
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer__sign_up);

        

    }
}
