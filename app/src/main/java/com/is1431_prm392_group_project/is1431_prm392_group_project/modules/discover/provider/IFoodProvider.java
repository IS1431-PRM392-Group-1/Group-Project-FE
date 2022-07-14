package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.discover.provider;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;

public class IFoodProvider {
    protected Repo repo;

    public IFoodProvider(Context context) {
        this.repo = new Repo(context);
    }
}
