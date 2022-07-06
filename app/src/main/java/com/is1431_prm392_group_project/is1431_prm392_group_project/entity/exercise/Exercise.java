package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;

public class Exercise {
    public int getId() {
        return id;
    }

    @DatabaseField(id = true, generatedId = true)
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @DatabaseField
    String name;

    public Exercise() {
    }


    private int save(Repo repo) {
        if (repo.exercise.getByID(id) == null) {
            return repo.exercise.create(this);
        } else {
            return repo.exercise.update(this);
        }
    }

    public int update(Repo repo) throws Exception {
        if (repo.exercise.getByID(id) == null) {
            return repo.exercise.create(this);
        } else {
            return repo.exercise.update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.exercise.delete(this);
    }
}
