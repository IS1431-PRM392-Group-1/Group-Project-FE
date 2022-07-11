package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;

import com.is1431_prm392_group_project.is1431_prm392_group_project.databinding.ActivityAuthBinding;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.providers.AuthProvider;
import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
public class AuthActivity extends AppCompatActivity {
    AuthProvider provider;
    private ActivityAuthBinding binding;
    private AppBarConfiguration appBarConfiguration;
    private void bindingInit() {
        binding = ActivityAuthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_auth);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
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