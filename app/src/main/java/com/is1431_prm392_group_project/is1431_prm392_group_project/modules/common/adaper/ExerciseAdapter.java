package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.adaper;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.demo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise.Exercise;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller.ExersiceDetail;

import java.util.ArrayList;

public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {

    Context context;
    ArrayList<Exercise> exercises;
    LayoutInflater inflater;


    ExersiceDetail fragDetail;
    FragmentManager fragManager;
    FragmentTransaction transaction;


    public ExerciseAdapter(Context context, ArrayList<Exercise> exercises) {
        this.context = context;
        this.exercises = exercises;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ExerciseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.exercise_layout, parent, false);
        ;
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        Exercise exercise = exercises.get(position);
        holder.txtName.setText(exercise.getName());
        holder.textTime.setText(exercise.getTime());
        holder.txt_perday.setText(exercise.getPerday());

        holder.btn_exercise_detail.setOnClickListener(this::onClickShowFragment);

        holder.btn_start_exercise.setOnClickListener(view -> {
            //this is activity start exercise
            //demo start a activity
            Intent intent = new Intent(context, demo.class);
            context.startActivity(intent);
        });
    }

    private void onClickShowFragment(View view) {
        //show fragment
        //demo start a activity
        AppCompatActivity activity = (AppCompatActivity) view.getContext();
        fragDetail = new ExersiceDetail();
        activity.getSupportFragmentManager().beginTransaction().replace(R.id.exerciseActivity, fragDetail).addToBackStack(null).commit();
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }

    public class ExerciseViewHolder extends RecyclerView.ViewHolder {

        private ImageView btn_exercise_detail;
        private TextView txtName, textTime, txt_perday;
        private Button btn_start_exercise;

        public ExerciseViewHolder(@NonNull View exereciseView) {
            super(exereciseView);
            bindingView(exereciseView);
        }

        private void bindingView(View exerciseView) {
            txtName = exerciseView.findViewById(R.id.text_name_exercise);
            textTime = exerciseView.findViewById(R.id.text_time_exercise);
            txt_perday = exerciseView.findViewById(R.id.text_preday_exercise);
            btn_exercise_detail = exerciseView.findViewById(R.id.btn_view_detail);
            btn_start_exercise = exerciseView.findViewById(R.id.btn_start_exercise);
        }
    }

}
