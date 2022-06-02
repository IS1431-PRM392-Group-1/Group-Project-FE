package com.is1431_prm392_group_project.is1431_prm392_group_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.user.User;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller.AuthController;

public class MainActivity extends AppCompatActivity {
    TextView txtOutput;
    Repo repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);

        txtOutput = (TextView) findViewById(R.id.output);

        repo = new Repo(this);

        User user = new User("Bruno", "Shadow", "MySecretPassword",
                "email@gmail.com");
        user.save(repo);

        Intent i = new Intent(getApplicationContext(), AuthController.class);
        startActivity(i);
    }
}