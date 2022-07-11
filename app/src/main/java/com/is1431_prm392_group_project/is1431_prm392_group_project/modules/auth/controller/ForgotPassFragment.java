package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.controller;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.is1431_prm392_group_project.is1431_prm392_group_project.databinding.FragmentForgotPassBinding;


public class ForgotPassFragment extends Fragment {

    private FragmentForgotPassBinding binding;


    private void bindingView() {

    }

    private void bindingAction() {

    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentForgotPassBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindingView();
        bindingAction();

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}