package com.devigntech.gymobile.TrainerAppFiles.Trainer_Authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.devigntech.gymobile.R;

public class Trainer_Login extends AppCompatActivity
{
    private EditText trainerEmail, trainerPassword;
    private Button loginTrainerBtn;
    private TextView register_accountBtn;

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

        trainerEmail = (EditText) findViewById(R.id.login_trainer_email_txtID);
        trainerPassword = (EditText) findViewById(R.id.login_trainer_pswrd_txtID);
        loginTrainerBtn = (Button) findViewById(R.id.trainer_login_btnID);
        register_accountBtn = (TextView) findViewById(R.id.create_new_account_btnID);

        loginTrainerBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        register_accountBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

    }
}
