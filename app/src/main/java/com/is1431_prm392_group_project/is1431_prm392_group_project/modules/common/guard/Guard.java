package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.guard;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;

public class Guard {
    public static boolean exitUser(Context context) {
        Repo repo = new Repo(context);
        return repo.getUsers().getAll().size() > 0;
    }
}
