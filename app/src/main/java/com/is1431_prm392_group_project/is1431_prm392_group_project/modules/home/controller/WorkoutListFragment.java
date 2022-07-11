package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.is1431_prm392_group_project.is1431_prm392_group_project.databinding.FragmentWorkoutListBinding;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.providers.HomeProvider;

public class WorkoutListFragment extends Fragment {
    private FragmentWorkoutListBinding binding;
    private HomeProvider provider;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentWorkoutListBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        provider = new HomeProvider(getContext());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}