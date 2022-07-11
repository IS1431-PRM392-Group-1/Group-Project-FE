package com.is1431_prm392_group_project.is1431_prm392_group_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.controller.HomeMenu;

public class MainActivity extends AppCompatActivity {
    Repo repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = new Intent(getApplicationContext(), HomeMenu.class);
        startActivity(i);
    }
}