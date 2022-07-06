package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise.Exercise;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.adaper.ExerciseAdapter;

import java.util.ArrayList;


public class ExerciseActivity extends AppCompatActivity {


    private RecyclerView rc_Exercise;
    private final ArrayList<Exercise> exercises = new ArrayList<>();

    private void bindingView() {
        rc_Exercise = findViewById(R.id.rc_exercise);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        bindingView();
        //thieu gif begin
        exercises.add(new Exercise(1,"After 18 age","30 Days","15 min"));
        exercises.add(new Exercise(2,"After 24 age","60 Days","15 min"));
        exercises.add(new Exercise(3,"After 40 age","15 Days","15 min"));

        initRecyclerView();
    }

    private void initRecyclerView() {
        ExerciseAdapter adapter = new ExerciseAdapter(this,exercises);
        rc_Exercise.setLayoutManager(new LinearLayoutManager(this));
        rc_Exercise.setAdapter(adapter);
    }
}