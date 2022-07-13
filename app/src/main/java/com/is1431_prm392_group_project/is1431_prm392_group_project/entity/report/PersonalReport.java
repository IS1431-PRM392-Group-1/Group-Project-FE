package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.report;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;

import java.sql.Date;

public class PersonalReport {
    @DatabaseField(id = true, generatedId = true)
    int id;
    @DatabaseField
    double weight;
    @DatabaseField
    double height;
    @DatabaseField
    Date date;

    public PersonalReport() {
    }

    public int getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int update(Repo repo) throws Exception {
        if (repo.getPersonalReport().getByID(id) == null) {
            return repo.getPersonalReport().create(this);
        } else {
            return repo.getPersonalReport().update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.getPersonalReport().delete(this);
    }
}
