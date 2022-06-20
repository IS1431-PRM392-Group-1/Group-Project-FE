package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.is1431_prm392_group_project.is1431_prm392_group_project.databinding.FragmentWorkoutListBinding;

public class WorkoutListFragment extends Fragment {
    private FragmentWorkoutListBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentWorkoutListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        final TextView textView = binding.textGallery;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}