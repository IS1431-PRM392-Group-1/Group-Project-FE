package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.report.provider;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;

public class IReportService {
    protected Repo repo;

    public IReportService(Context context) {
        this.repo = new Repo(context);
    }
}
