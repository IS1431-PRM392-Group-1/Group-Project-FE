package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.providers;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.demo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise.ExerciseDetail;

import java.util.ArrayList;

public class ExerciseListAdapter extends RecyclerView.Adapter<ExerciseListAdapter.ViewHolder> {

    ArrayList<ExerciseList> exercise;
    Context context;
    LayoutInflater inflater;
    FragmentManager manager;
    FragmentTransaction transaction;
    ExerciseDetail exerciseDetail;

    public ExerciseListAdapter(ArrayList<ExerciseList> exercise, Context context) {
        this.exercise = exercise;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View item = inflater.inflate(R.layout.fragment_workout_list, parent, false);
        return new ViewHolder(item);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ExerciseList exercises = exercise.get(position);
        holder.text_name_exercise.setText(exercises.getName());
        holder.text_preday_exercise.setText(exercises.getPerday());
        holder.text_time_exercise.setText(exercises.getTime());
        holder.img_exercise_detail.setImageResource(exercises.getSrc_gif());
        holder.img_exercise_detail.setOnClickListener(this::onClickShowFragment);
        holder.btn_start_exercise.setOnClickListener(view -> {
            Intent intent = new Intent(context, demo.class);
            context.startActivity(intent);
        });

    }

    private void onClickShowFragment(View view) {
        //    AppCompatActivity activity = (AppCompatActivity) view.getContext();
        //    exerciseDetail = new ExersiceDetail();
        //    activity.getSupportFragmentManager().beginTransaction().replace(R.id.exerciseActivity, exerciseDetail).addToBackStack(null).commit();
    }

    @Override
    public int getItemCount() {
        return exercise.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView img_exercise_detail;
        private TextView text_name_exercise;
        private TextView text_time_exercise;
        private TextView text_preday_exercise;
        private Button btn_start_exercise;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            bindingView(itemView);
        }

        private void bindingView(View itemView) {
            text_name_exercise = itemView.findViewById(R.id.text_name_exercises);
            text_time_exercise = itemView.findViewById(R.id.text_time_exercises);
            text_preday_exercise = itemView.findViewById(R.id.text_preday_exercises);
            btn_start_exercise = itemView.findViewById(R.id.btn_start_exercises);
            img_exercise_detail = itemView.findViewById(R.id.img_view_detail);
        }
    }
}
