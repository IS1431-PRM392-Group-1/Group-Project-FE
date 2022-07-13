package com.is1431_prm392_group_project.is1431_prm392_group_project.entity.user;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.j256.ormlite.field.DatabaseField;

public class User {
    @DatabaseField(id = true)
    String username;
    @DatabaseField
    String password;
    @DatabaseField
    String email;

    public User() {
    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int update(Repo repo) throws Exception {
        if (repo.getUsers().getByUsername(username) == null) {
            return repo.getUsers().create(this);
        } else {
            return repo.getUsers().update(this);
        }
    }

    public int delete(Repo repo) {
        return repo.getUsers().delete(this);
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public void setHeight(float height) {
    }

    public void setWeight(float weight) {
    }

    public void setGender(String gender) {
    }
}
