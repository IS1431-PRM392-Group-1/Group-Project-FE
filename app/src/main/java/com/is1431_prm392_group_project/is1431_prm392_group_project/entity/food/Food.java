package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.food;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;

public class Food {
    @DatabaseField(id = true, generatedId = true)
    int id;
    @DatabaseField
    String name;
    @DatabaseField
    double calo;

    public Food() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCalo() {
        return calo;
    }

    public void setCalo(double calo) {
        this.calo = calo;
    }

    private int save(Repo repo) {
        if (repo.food.getByID(id) == null) {
            return repo.food.create(this);
        } else {
            return repo.food.update(this);
        }
    }

    public int update(Repo repo) throws Exception {
        if (repo.food.getByID(id) == null) {
            return repo.food.create(this);
        } else {
            return repo.food.update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.food.delete(this);
    }
}
