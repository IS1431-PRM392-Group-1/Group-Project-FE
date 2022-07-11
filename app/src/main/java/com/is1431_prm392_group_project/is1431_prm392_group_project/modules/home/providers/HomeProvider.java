package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.providers;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;

import java.util.ArrayList;

public class HomeProvider extends IHomeProvider {
    RecyclerView rcvExercise;
    ArrayList<ExerciseList> exerciseList = new ArrayList<>();
    public HomeProvider(Context context) {
        super(context);
        bindingView();
        getExerciseLists();
        initRecyclerView();
    }

    private void bindingView() {
        rcvExercise.findViewById(R.id.rcvExerciseList);
    }

    private void initRecyclerView() {
        ExerciseListAdapter adapter = new ExerciseListAdapter(exerciseList, rcvExercise.getContext());
        rcvExercise.setAdapter(adapter);
        rcvExercise.setLayoutManager(new LinearLayoutManager(rcvExercise.getContext()));
    }

    @Override
    public ArrayList<ExerciseList> getExerciseLists() {
        return super.getExerciseLists();
    }
}
