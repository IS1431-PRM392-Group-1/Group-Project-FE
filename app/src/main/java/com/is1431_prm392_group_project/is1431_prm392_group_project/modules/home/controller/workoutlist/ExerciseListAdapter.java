package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.controller.workoutlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;

import java.util.ArrayList;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExeListRecyclerViewHolder> {
    ArrayList<ExerciseList> exercise;
    LayoutInflater inflater;
public ExerciseListAdapter(ArrayList<ExerciseList> exercise){
    this.exercise = exercise;
}

    @Override
    public int getItemViewType(final int position) {
        return R.layout.frame_exelist;
    }

    @NonNull
    @Override
    public ExeListRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = inflater.inflate(R.layout.fragment_workout_list, parent, false);
        return new ExeListRecyclerViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ExeListRecyclerViewHolder holder, int position) {
        ExerciseList exercises = exercise.get(position);
        holder.getText_name_exercise().setText(exercises.getName());
        holder.getText_preday_exercise().setText(exercises.getPerday());
        holder.getText_time_exercise().setText(exercises.getTime());
    }

    @Override
    public int getItemCount() {
        return exercise.size();
    }
}
