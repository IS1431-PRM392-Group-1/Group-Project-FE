package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.providers.AuthService;

public class LoginActivity extends AppCompatActivity {
    AuthService service;
    private Button btnLogin;
    private EditText inputLogin;
    private EditText inputPass;

    private void bindingView() {
        this.inputLogin = findViewById(R.id.input_login);
        this.inputPass = findViewById(R.id.input_password);
        this.btnLogin = findViewById(R.id.btnLogin);
    }

    private void bindingAction() {
        this.btnLogin.setOnClickListener(view1 -> login());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        bindingView();
        bindingAction();
        this.service = new AuthService(this);
    }

    public void login() {
        if (service.login(inputLogin.getText().toString(), inputPass.getText().toString())) {
            Toast.makeText(this, "Login done", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show();
        }
    }
}