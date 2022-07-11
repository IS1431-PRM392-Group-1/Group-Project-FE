package com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.exercise;

public class Exercise {
    private int id;
    private String name;
    private String time;
    private String perday;
    private int src_gif_id;

    public Exercise() {

    }

    public Exercise(int id, String name, String time, String perday, int src_gif_id) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.perday = perday;
        this.src_gif_id = src_gif_id;
    }

    public int getSrc_gif_id() {
        return src_gif_id;
    }

    public void setSrc_gif_id(int src_gif_id) {
        this.src_gif_id = src_gif_id;
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