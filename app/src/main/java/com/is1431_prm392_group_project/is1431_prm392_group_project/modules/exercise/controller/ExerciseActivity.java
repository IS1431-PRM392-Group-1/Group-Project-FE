package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;

import java.util.ArrayList;

public class ExerciseActivity extends AppCompatActivity {

    private final ArrayList<ExerciseList> exercises = new ArrayList<>();
    private RecyclerView rc_Exercise;

    private void bindingView() {
        rc_Exercise = findViewById(R.id.rc_exercise);
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        bindingView();
        initRecyclerView();
    }

    private void initRecyclerView() {
        ExerciseAdapter adapter = new ExerciseAdapter(this, exercises);
        rc_Exercise.setLayoutManager(new LinearLayoutManager(this));
        rc_Exercise.setAdapter(adapter);
    }
}