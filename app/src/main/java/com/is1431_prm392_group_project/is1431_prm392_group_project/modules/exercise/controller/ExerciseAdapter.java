package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;


public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {

    Context context;
    ArrayList<ExerciseList> exercises;
    LayoutInflater inflater;

    ExersiceDetail fragDetail;
    FragmentManager fragManager;
    FragmentTransaction transaction;

    int[] array;

    public ExerciseAdapter(Context context, ArrayList<ExerciseList> exercises) {
        this.context = context;
        this.exercises = exercises;
        inflater = LayoutInflater.from(context);
        array = new int[]{R.drawable.exersice_1, R.drawable.exersice_2, R.drawable.exersice_3, R.drawable.exersice_4,
                R.drawable.exersice_5, R.drawable.exersice_6, R.drawable.exersice_7, R.drawable.exersice_8, R.drawable.exersice_9,
                R.drawable.exersice_10, R.drawable.exersice_11, R.drawable.exersice_12, R.drawable.exersice_13, R.drawable.exersice_14,
                R.drawable.exersice_15};
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.exercise_layout, parent, false);
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        ExerciseList exercise = exercises.get(position);
        holder.txtName.setText(exercise.getName());
        holder.textTime.setText(exercise.getTime());
        holder.txt_perday.setText(exercise.getPerday());
        holder.gifImageView.setImageResource(array[exercise.getSrc_gif_id()]);


        holder.btn_start_exercise.setOnClickListener(this::onStartExerciseActivity);
    }

    private void onStartExerciseActivity(View view) {
        Intent intent = new Intent(context, StartActivity.class);
        context.startActivity(intent);
    }


    @Override
    public int getItemCount() {
        return exercises.size();
    }

    public static class ExerciseViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName, textTime, txt_perday, btn_start_exercise;
        private GifImageView gifImageView;

        public ExerciseViewHolder(@NonNull View itemView) {
            super(itemView);
            bindingView(itemView);
        }

        private void bindingView(View exerciseView) {
            txtName = exerciseView.findViewById(R.id.text_name_exercise);
            textTime = exerciseView.findViewById(R.id.text_time_exercise);
            txt_perday = exerciseView.findViewById(R.id.text_preday_exercise);
            btn_start_exercise = exerciseView.findViewById(R.id.btn_start_exercise);
            gifImageView = exerciseView.findViewById(R.id.gif_exercise);
        }
    }

}
