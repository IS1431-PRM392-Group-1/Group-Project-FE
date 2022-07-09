package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.Map;

public class ExerciseList {

    @DatabaseField(id = true, generatedId = true)
    int id;
    @DatabaseField
    String name;
    @DatabaseField(dataType = DataType.SERIALIZABLE)
    Map<Exercise, Integer> list;

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


    public Map<Exercise, Integer> getList() {

        return list;
    }

    public void setList(Map<Exercise, Integer> list) {
        this.list = list;
    }

    private int save(Repo repo) {
        if (repo.exerciseList.getByID(id) == null) {
            return repo.exerciseList.create(this);
        } else {
            return repo.exerciseList.update(this);
        }
    }

    public int update(Repo repo) throws Exception {
        if (repo.exerciseList.getByID(id) == null) {
            return repo.exerciseList.create(this);
        } else {
            return repo.exerciseList.update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.exerciseList.delete(this);
    }
}
