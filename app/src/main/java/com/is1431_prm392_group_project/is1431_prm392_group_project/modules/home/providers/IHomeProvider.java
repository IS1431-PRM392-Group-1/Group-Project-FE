package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.home.providers;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.exercise.ExerciseList;
import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.food.Food;

import java.util.ArrayList;

public class IHomeProvider {
    protected Repo repo;

    public IHomeProvider(Context context) {
        this.repo = new Repo(context);
    }

    public ArrayList<ExerciseList> getExerciseLists() {
        ArrayList<ExerciseList> list = new ArrayList<>();
        ExerciseList e1 = new ExerciseList();
        e1.setName("e1");
        ExerciseList e2 = new ExerciseList();
        e2.setName("e2");
        ExerciseList e3 = new ExerciseList();
        e3.setName("e3");
        try {
            e1.update(repo);
            e2.update(repo);
            e3.update(repo);
            list.add(e1);
            list.add(e2);
            list.add(e3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<Food> getFoods() {
        ArrayList<Food> list = new ArrayList<>();
        Food e1 = new Food();
        e1.setName("e1");
        e1.setCalo(300);
        Food e2 = new Food();
        e2.setName("e2");
        e2.setCalo(400);
        Food e3 = new Food();
        e3.setName("e3");
        e3.setCalo(400);
        try {
            e1.update(repo);
            e2.update(repo);
            e3.update(repo);
            list.add(e1);
            list.add(e2);
            list.add(e3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
