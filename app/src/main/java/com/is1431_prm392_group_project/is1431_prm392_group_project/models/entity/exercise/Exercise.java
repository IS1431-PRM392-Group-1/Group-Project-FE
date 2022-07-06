package com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise;

public class Exercise {
    private int id;
    private String name;
    private String time;
    private String perday;

    public Exercise() {
    }

    public Exercise(int id, String name, String time, String perday) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.perday = perday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", perday='" + perday + '\'' +
                '}';
    }
}