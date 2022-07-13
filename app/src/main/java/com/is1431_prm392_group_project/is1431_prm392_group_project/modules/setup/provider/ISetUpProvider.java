package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.setup.provider;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;

public class ISetUpProvider {
    protected Repo repo;

    public ISetUpProvider(Context context) {
        this.repo = new Repo(context);
    }
}
