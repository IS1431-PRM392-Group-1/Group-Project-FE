package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.feature.UpdateOnFeature;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent1 = new Intent(this, UpdateOnFeature.class);
        startActivity(intent1);
    }
}