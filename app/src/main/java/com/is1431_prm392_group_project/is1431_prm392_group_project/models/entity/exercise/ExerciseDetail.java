package com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise;

public class ExerciseDetail {
    private int id;
    private String name;
    private int times;
    private int time;

    public ExerciseDetail() {
    }

    public ExerciseDetail(int id, String name, int times, int time) {
        this.id = id;
        this.name = name;
        this.times = times;
        this.time = time;
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

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ExerciseDetail{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", times=" + times +
                ", time=" + time +
                '}';
    }
}
