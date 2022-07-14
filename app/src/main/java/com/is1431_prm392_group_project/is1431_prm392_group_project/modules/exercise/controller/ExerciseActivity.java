package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.providers.ExerciseService;

import java.util.ArrayList;

// TODO
public class ExerciseActivity extends AppCompatActivity {
    private ArrayList<ExerciseList> exercises = new ArrayList<>();
    private RecyclerView rc_Exercise;
    private ExerciseService service;

    private void bindingView() {
        rc_Exercise = findViewById(R.id.rc_exercise);
    }

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        service = new ExerciseService(this);
        exercises = service.getExerciseLists();
        bindingView();
        initRecyclerView();
    }

    private void initRecyclerView() {
        ExerciseAdapter adapter = new ExerciseAdapter(this, exercises);
        rc_Exercise.setLayoutManager(new LinearLayoutManager(this));
        rc_Exercise.setAdapter(adapter);
    }
}