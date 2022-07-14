package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.profile.provider;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;

public class IProfileProvider {
    protected Repo repo;

    public IProfileProvider(Context context) {
        this.repo = new Repo(context);
    }
}
