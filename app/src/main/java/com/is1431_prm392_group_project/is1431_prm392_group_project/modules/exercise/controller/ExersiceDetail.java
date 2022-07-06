package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise.ExerciseDetail;

import java.util.ArrayList;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.adaper.ExerciseDetailAdapter;

public class ExersiceDetail extends Fragment {

    private RecyclerView rc_ExerciseDetail;
    private ArrayList<ExerciseDetail> exercises;

    public ExersiceDetail() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_exersice_detail, container, false);
        rc_ExerciseDetail = view.findViewById(R.id.rc_detail);
        rc_ExerciseDetail.setLayoutManager(new LinearLayoutManager(getContext()));

        exercises = new ArrayList<>();
        exercises.add(new ExerciseDetail(1,"After 18 age",2,15));
        exercises.add(new ExerciseDetail(2,"After 18 age",2,15));
        exercises.add(new ExerciseDetail(3,"After 18 age",2,15));
        Log.d("De1001", "onCreateView: " +exercises.get(1).getName());

        rc_ExerciseDetail.setAdapter(new ExerciseDetailAdapter(getContext(),exercises));
        return view;
    }

}