package com.is1431_prm392_group_project.is1431_prm392_group_project;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.user.User;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller.LoginActivity;

public class MainActivity extends AppCompatActivity {
    Repo repo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        repo = new Repo(this);
        User user = new User("admin", "12345",
                "email@gmail.com");
        user.save(repo);
        Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(i);
    }
}