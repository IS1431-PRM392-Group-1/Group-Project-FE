package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.adaper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise.ExerciseDetail;

import java.util.ArrayList;

public class ExerciseDetailAdapter extends RecyclerView.Adapter<ExerciseDetailAdapter.ExerciseDetailViewHolder> {
    Context context;
    ArrayList<ExerciseDetail> exercises;
    LayoutInflater inflater;

    public ExerciseDetailAdapter(Context context, ArrayList<ExerciseDetail> exercises) {
        this.context = context;
        this.exercises = exercises;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ExerciseDetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.exercise_detail_layout, parent, false);
        ;
        return new ExerciseDetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseDetailViewHolder holder, int position) {
        ExerciseDetail exercise = exercises.get(position);
        holder.txtName.setText(exercise.getName());
        holder.textTime.setText(exercise.getTime() + "times");
        holder.txt_perday.setText(exercise.getTimes() + "MIN");
    }

    @Override
    public int getItemCount() {
        return exercises.size();
    }

    public class ExerciseDetailViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName, textTime, txt_perday;

        public ExerciseDetailViewHolder(@NonNull View exereciseView) {
            super(exereciseView);
            bindingView(exereciseView);
        }

        private void bindingView(View exereciseView) {
            txtName = exereciseView.findViewById(R.id.text_name_action);
            textTime = exereciseView.findViewById(R.id.text_time_action);
            txt_perday = exereciseView.findViewById(R.id.text_times_action);
        }
    }
}
