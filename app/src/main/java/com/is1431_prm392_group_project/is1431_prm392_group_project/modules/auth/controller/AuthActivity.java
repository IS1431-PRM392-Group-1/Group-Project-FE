package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.databinding.ActivityAuthBinding;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.providers.AuthProvider;

public class AuthActivity extends AppCompatActivity {
    AuthProvider provider;
    private ActivityAuthBinding binding;

    private void bindingInit() {
        binding = ActivityAuthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    private void bindingView() {
    }

    private void bindingAction() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        provider = new AuthProvider(this);
        bindingInit();
        bindingView();
        bindingAction();
    }
}