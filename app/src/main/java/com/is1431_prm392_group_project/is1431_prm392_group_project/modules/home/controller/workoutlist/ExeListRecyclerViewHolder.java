package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.controller.workoutlist;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.is1431_prm392_group_project.is1431_prm392_group_project.R;

public class ExeListRecyclerViewHolder extends RecyclerView.ViewHolder {


    private TextView text_name_exercise;
    private TextView text_time_exercise;

    public TextView getText_name_exercise() {
        return text_name_exercise;
    }

    public void setText_name_exercise(TextView text_name_exercise) {
        this.text_name_exercise = text_name_exercise;
    }

    public TextView getText_time_exercise() {
        return text_time_exercise;
    }

    public void setText_time_exercise(TextView text_time_exercise) {
        this.text_time_exercise = text_time_exercise;
    }

    public TextView getText_preday_exercise() {
        return text_preday_exercise;
    }

    public void setText_preday_exercise(TextView text_preday_exercise) {
        this.text_preday_exercise = text_preday_exercise;
    }

    public Button getBtn_start_exercise() {
        return btn_start_exercise;
    }

    public void setBtn_start_exercise(Button btn_start_exercise) {
        this.btn_start_exercise = btn_start_exercise;
    }

    private TextView text_preday_exercise;
    private Button btn_start_exercise;
    public ExeListRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        bindingView(itemView);
    }

    private void bindingView(View itemView) {
        text_name_exercise = itemView.findViewById(R.id.text_name_exercises);
        text_time_exercise = itemView.findViewById(R.id.text_time_exercises);
        text_preday_exercise = itemView.findViewById(R.id.text_preday_exercises);
        btn_start_exercise = itemView.findViewById(R.id.btn_start_exercises);

    }
}
