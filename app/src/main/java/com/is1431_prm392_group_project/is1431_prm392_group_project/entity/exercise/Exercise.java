package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;

public class Exercise {
    public int getId() {
        return id;
    }

    @DatabaseField(id = true, generatedId = true)
    private int id;

    @DatabaseField
    private String name;

    @DatabaseField
    private String time;

    @DatabaseField
    private String perday;

    @DatabaseField
    private String src_gif;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPerday() {
        return perday;
    }

    public void setPerday(String perday) {
        this.perday = perday;
    }

    public String getSrc_gif() {
        return src_gif;
    }

    public void setSrc_gif(String src_gif) {
        this.src_gif = src_gif;
    }

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
