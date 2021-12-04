package com.example.uts_pbp_f_kelompok_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.uts_pbp_f_kelompok_3.userPreferences.UserPreferences;
import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {
    private EditText etUsername, etPassword;
    private MaterialButton btnClear, btnLogin;
    private UserPreferences userPreferences;
//tes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userPreferences = new UserPreferences(LoginActivity.this);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);

        btnClear = findViewById(R.id.btn_clear_text);
        btnLogin = findViewById(R.id.btn_login);

        checkLogin();

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etUsername.setText("");
                etPassword.setText("");
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateForm()) {
                    if(etUsername.getText().toString().trim().equals("test")
                            && etPassword.getText().toString().trim().equals("123")) {
                        userPreferences.setLogin(etUsername.getText().toString().trim(),etPassword.getText().toString().trim());
                        checkLogin();
                    }else {
                        Toast.makeText(LoginActivity.this,"Username Atau Password Salah",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private boolean validateForm() {
        if(etUsername.getText().toString().trim().isEmpty() || etPassword.getText().toString().trim().isEmpty()){
            Toast.makeText(LoginActivity.this,"Username Atau Password Salah",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    private void checkLogin(){
        if(userPreferences.checkLogin()){
            startActivity(new Intent(LoginActivity.this, MainActivity.class));
            finish();
        }
    }
}