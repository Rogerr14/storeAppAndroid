package com.example.fakestoreapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginActivity extends AppCompatActivity {
    private TextInputEditText usernameEditText;
    private EditText passwordEditText;
    private TextInputLayout usernameInputLayout, passwordInputLayout;
    private MaterialButton loginButton;

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        usernameInputLayout =  findViewById(R.id.usernameInputLayout);
        passwordInputLayout = findViewById(R.id.passwordInputLayout);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener((view)->{
            String username =  usernameEditText.getText().toString().trim();
            String password =  passwordEditText.getText().toString().trim();

            if(username.isEmpty() || password.isEmpty()){
                usernameInputLayout.setError("El campo es requerido");
                passwordInputLayout.setError("El campo es requerido");
            }else{
                usernameInputLayout.setError(null);
                passwordInputLayout.setError(null);
            }

            Toast.makeText(this, "Usuario: " +username, Toast.LENGTH_SHORT ).show();



        });



    }
}
