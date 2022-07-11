package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

public class ExerciseList {
    @DatabaseField(id = true, generatedId = true)
    int id;
    @DatabaseField
    String name;
    @ForeignCollectionField(eager = false)
    private ForeignCollection<Exercise> list;

    public ExerciseList() {
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

    public ForeignCollection<Exercise> getList() {
        return list;
    }

    public void setList(ForeignCollection<Exercise> list) {
        this.list = list;
    }

    private int save(Repo repo) {
        if (repo.getExerciseList().getByID(id) == null) {
            return repo.getExerciseList().create(this);
        } else {
            return repo.getExerciseList().update(this);
        }
    }

    public int update(Repo repo) throws Exception {
        if (repo.getExerciseList().getByID(id) == null) {
            return repo.getExerciseList().create(this);
        } else {
            return repo.getExerciseList().update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.getExerciseList().delete(this);
    }
}