package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.providers;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;

public abstract class IAuthProvider {
    protected Repo repo;

    public IAuthProvider(Context context) {
        this.repo = new Repo(context);
    }

    public boolean login(String username, String password) {
        return false;
    }
}
