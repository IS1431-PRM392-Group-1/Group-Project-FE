package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;

import java.sql.Date;

public class PracticeReport {
    @DatabaseField(id = true, generatedId = true)
    int id;
    @DatabaseField
    double calo;
    @DatabaseField
    Date date;

    public PracticeReport() {
    }

    public int getId() {
        return id;
    }

    public double getCalo() {
        return calo;
    }

    public void setCalo(double calo) {
        this.calo = calo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private int save(Repo repo) {
        if (repo.practiceReport.getByID(id) == null) {
            return repo.practiceReport.create(this);
        } else {
            return repo.practiceReport.update(this);
        }
    }

    public int update(Repo repo) throws Exception {
        if (repo.practiceReport.getByID(id) == null) {
            return repo.practiceReport.create(this);
        } else {
            return repo.practiceReport.update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.practiceReport.delete(this);
    }
}
