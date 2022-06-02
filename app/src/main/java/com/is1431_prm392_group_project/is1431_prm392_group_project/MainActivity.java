package com.is1431_prm392_group_project.is1431_prm392_group_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.user.User;

public class MainActivity extends AppCompatActivity {
    TextView txtOutput;
    Repo repo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOutput = (TextView) findViewById(R.id.output);

        repo = new Repo(this);

        User user = new User("Bruno", "Shadow", "MySecretPassword",
                "email@gmail.com");

        txtOutput.append("Creating User: " + user.getAlias());
        user.save(repo);
        txtOutput.append("\nUser: " + user.getAlias() + " created successfully!");
        user = repo.Users.getByUsername("Shadow");
        txtOutput.append("\nUser: " + user.getAlias() + " retrieved successfully!");
        user.delete(repo);
        txtOutput.append("\nUser: " + user.getAlias() + " deleted successfully!");
    }
}