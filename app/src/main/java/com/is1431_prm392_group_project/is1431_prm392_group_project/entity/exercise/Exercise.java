package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;

public class Exercise {
    @DatabaseField(id = true, generatedId = true)
    int id;
    @DatabaseField
    String name;

    public Exercise() {
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

    private int save(Repo repo) {
        if (repo.getExercise().getByID(id) == null) {
            return repo.getExercise().create(this);
        } else {
            return repo.getExercise().update(this);
        }
    }

    public int update(Repo repo) throws Exception {
        if (repo.getExercise().getByID(id) == null) {
            return repo.getExercise().create(this);
        } else {
            return repo.getExercise().update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.getExercise().delete(this);
    }
}