package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.is1431_prm392_group_project.is1431_prm392_group_project.databinding.FragmentDiscoverBinding;

public class DiscoverFragment extends Fragment {
    private FragmentDiscoverBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDiscoverBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}