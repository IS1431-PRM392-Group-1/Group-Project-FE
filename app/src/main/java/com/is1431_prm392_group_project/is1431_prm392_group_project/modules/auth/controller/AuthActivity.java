package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.databinding.ActivityAuthBinding;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.providers.AuthProvider;

public class AuthActivity extends FragmentActivity {
    AuthProvider provider;
    private ActivityAuthBinding binding;
    private AppBarConfiguration appBarConfiguration;

    private void bindingInit() {
        binding = ActivityAuthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_auth);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        provider = new AuthProvider(this);
    }

    private void bindingView() {
    }

    private void bindingAction() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindingInit();
        bindingView();
        bindingAction();
    }
}