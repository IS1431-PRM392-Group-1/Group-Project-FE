package com.is1431_prm392_group_project.is1431_prm392_group_project.dao;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoExercise;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoExerciseAmount;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoExerciseList;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoFood;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoPracticeReport;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoUsers;

public class Repo {
    private RepoUsers Users;
    private RepoPracticeReport practiceReport;
    private RepoExercise exercise;
    private RepoExerciseList exerciseList;
    private RepoFood Food;
    private RepoExerciseAmount exerciseAmount;
    private DatabaseHelper db;

    public Repo(Context context) {
        DatabaseManager<DatabaseHelper> manager = new DatabaseManager<DatabaseHelper>();
        db = manager.getHelper(context);
    }

    public RepoExerciseAmount getExerciseAmount() {
        return exerciseAmount = new RepoExerciseAmount(db);
    }

    public RepoUsers getUsers() {
        return Users = new RepoUsers(db);
    }

    public RepoPracticeReport getPracticeReport() {
        return practiceReport = new RepoPracticeReport(db);
    }

    public RepoExercise getExercise() {
        return exercise = new RepoExercise(db);
    }

    public RepoExerciseList getExerciseList() {
        return exerciseList = new RepoExerciseList(db);
    }

    public RepoFood getFood() {
        return Food = new RepoFood(db);
    }
}
