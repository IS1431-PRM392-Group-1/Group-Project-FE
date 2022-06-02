package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.user.User;

public class AuthController extends AppCompatActivity {
    TextView txtOutput;
    Repo repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
        repo = new Repo(this);
       User  user = repo.Users.getByUsername("Shadow");
         txtOutput = (TextView) findViewById(R.id.output);
        txtOutput.append("Creating User: " + user.getAlias());

        txtOutput.append("\nUser: " + user.getAlias() + " created successfully!");
        user = repo.Users.getByUsername("Shadow");
        txtOutput.append("\nUser: " + user.getAlias() + " retrieved successfully!");
        user.delete(repo);
        txtOutput.append("\nUser: " + user.getAlias() + " deleted successfully!");
    }
}