package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.Exercise;

import java.util.ArrayList;


public class ExersiceDetail extends Fragment {

    private RecyclerView rc_ExerciseDetail;
    private ArrayList<Exercise> exercises;

    public ExersiceDetail() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_exersice_detail, container, false);

        rc_ExerciseDetail.setLayoutManager(new LinearLayoutManager(getContext()));


        rc_ExerciseDetail.setAdapter(new ExerciseDetailAdapter(getContext(), exercises));
        return view;
    }

}