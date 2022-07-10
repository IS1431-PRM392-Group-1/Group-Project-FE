package com.is1431_prm392_group_project.is1431_prm392_group_project.dao;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoExercise;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoExerciseList;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoFood;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoPersonalReport;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoPracticeReport;
import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoUsers;

public class Repo {
    public RepoUsers Users;
    public RepoPracticeReport practiceReport;
    public RepoPersonalReport personalReport;
    public RepoExercise exercise;
    public RepoExerciseList exerciseList;
    public RepoFood food;
    DatabaseHelper db;

    public Repo(Context context) {
        DatabaseManager<DatabaseHelper> manager = new DatabaseManager<DatabaseHelper>();
        db = manager.getHelper(context);
        Users = new RepoUsers(db);
        practiceReport = new RepoPracticeReport(db);
        personalReport = new RepoPersonalReport(db);
        exercise = new RepoExercise(db);
        exerciseList = new RepoExerciseList(db);
        food = new RepoFood(db);
    }
}
