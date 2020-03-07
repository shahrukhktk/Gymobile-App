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

public class TrainerForgotPassword extends AppCompatActivity
{
    private EditText newPassword, confirmPassword;
    private Button SaveChanges;
    private TextView backToLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //TO REMOVE THE NOTIFICATION BAR FROM SPLASH SCREEN
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainer_forgot_password);

        newPassword = (EditText) findViewById(R.id.newpassword_txtID);
        confirmPassword = (EditText) findViewById(R.id.confirm_pswrd_txtID);
        SaveChanges = (Button) findViewById(R.id.save_Changes_btnID);
        backToLoginBtn = (TextView) findViewById(R.id.backtoLogin_BtnID);

        SaveChanges.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        backToLoginBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(getApplicationContext(), Trainer_Login.class));
            }
        });

    }
}
