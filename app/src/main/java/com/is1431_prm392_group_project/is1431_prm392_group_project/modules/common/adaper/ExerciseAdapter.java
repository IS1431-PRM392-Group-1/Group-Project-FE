package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.adaper;

import android.content.Context;
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
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise.Exercise;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.controller.ExersiceDetail;

import java.util.ArrayList;

import pl.droidsonroids.gif.GifImageView;


public class ExerciseAdapter extends RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder> {

    Context context;
    ArrayList<Exercise> exercises;
    LayoutInflater inflater;
    ExersiceDetail fragDetail;

    int[] array;

    FragmentManager fragManager;
    FragmentTransaction transaction;


    public ExerciseAdapter(Context context, ArrayList<Exercise> exercises) {
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
        ;
        return new ExerciseViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExerciseViewHolder holder, int position) {
        Exercise exercise = exercises.get(position);
        holder.txtName.setText(exercise.getName());
        holder.textTime.setText(exercise.getTime());
        holder.txt_perday.setText(exercise.getPerday());

        holder.gif_exercise.setImageResource(array[exercise.getSrc_gif_id()]);


        holder.btn_exercise_detail.setOnClickListener(this::onClickShowFragment);
        holder.btn_start_exercise.setOnClickListener(view -> {

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
        private GifImageView gif_exercise;

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
            gif_exercise = exerciseView.findViewById(R.id.gif_exercise);
        }
    }
}
