package com.devigntech.gymobile.TrainerAppFiles.Trainer_Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        trainerName = (EditText) findViewById(R.id.register_trainer_fullname_txtID);
        trainerEmail = (EditText) findViewById(R.id.register_trainer_email_txtID);
        trainerPassword = (EditText) findViewById(R.id.register_trainer_pswrd_txtID);
        trainerConfirmPswrd = (EditText) findViewById(R.id.register_trainer_confirm_password_txtID);
        registerAccountBtn = (Button) findViewById(R.id.trainer_register_btnID);
        alreadyMemberBtn = (TextView) findViewById(R.id.already_member_btnID);

        registerAccountBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        alreadyMemberBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), Trainer_Login.class));
            }
        });

    }
}
