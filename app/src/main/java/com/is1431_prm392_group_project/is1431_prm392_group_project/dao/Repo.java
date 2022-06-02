package com.is1431_prm392_group_project.is1431_prm392_group_project.dao;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.entity.RepoUsers;

public class Repo {

    public RepoUsers Users;
    DatabaseHelper db;

    public Repo(Context context) {
        DatabaseManager<DatabaseHelper> manager = new DatabaseManager<DatabaseHelper>();
        db = manager.getHelper(context);

        Users = new RepoUsers(db);

    }

}
