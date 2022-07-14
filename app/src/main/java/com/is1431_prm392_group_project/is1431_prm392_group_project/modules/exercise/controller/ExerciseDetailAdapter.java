package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.Exercise;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;


public class ExerciseDetailAdapter extends RecyclerView.Adapter<ExerciseDetailAdapter.ExerciseDetailViewHolder> {

    Context context;
    ArrayList<Exercise> exercises;
    LayoutInflater inflater;
    int[] array;

    ExersiceDetail fragDetail;

    public ExerciseDetailAdapter(Context context, ArrayList<Exercise> exercises) {
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
    public ExerciseDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.exercise_detail_layout, parent, false);
        return new ExerciseDetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseDetailViewHolder holder, int position) {
        Exercise exercise = exercises.get(position);
        holder.txtName.setText(exercise.getName());
        holder.textTime.setText(exercise.getTime() + "times");
        holder.txt_perday.setText(exercise.getTimes() + "MIN");
        holder.gifImageView.setImageResource(array[exercise.getDetail_gif_id()]);

        holder.btn_exercise_detail.setOnClickListener(this::onClickShowFragment);
    }

    private void onClickShowFragment(View view) {
        //show fragment
        //demo start a activity
//        AppCompatActivity activity = (AppCompatActivity) view.getContext();
//        fragDetail = new ExersiceDetail();
//        activity.getSupportFragmentManager().beginTransaction().replace(R.id.exerciseActivity, fragDetail).addToBackStack(null).commit();
        Intent intent = new Intent(context, StartExercise.class);
        context.startActivity(intent);
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }

    public static class ExerciseDetailViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName, textTime, txt_perday;
        private GifImageView gifImageView;
        private ImageView btn_exercise_detail;

        public ExerciseDetailViewHolder(@NonNull View exereciseView) {
            super(exereciseView);
            bindingView(exereciseView);
        }

        private void bindingView(View exereciseView) {
            txtName = exereciseView.findViewById(R.id.text_name_action);
            textTime = exereciseView.findViewById(R.id.text_time_action);
            txt_perday = exereciseView.findViewById(R.id.text_times_action);
            gifImageView = exereciseView.findViewById(R.id.gif_exercise_detail);
            btn_exercise_detail = exereciseView.findViewById(R.id.btn_view_detail);
        }
    }
}
