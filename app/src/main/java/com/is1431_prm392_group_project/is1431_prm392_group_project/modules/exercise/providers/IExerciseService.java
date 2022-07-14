package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.exercise.providers;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;

public class IExerciseService {
    protected Repo repo;

    public IExerciseService(Context context) {
        this.repo = new Repo(context);
    }
}
