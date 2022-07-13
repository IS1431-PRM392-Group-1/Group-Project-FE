package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.setup.provider;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.user.User;

public class SetUpProvider extends ISetUpProvider {
    public SetUpProvider(Context context) {
        super(context);
    }

    public void insertProfile(String name, int age, float height, float weight, String gender, String email) throws Exception {
        User profile = repo.getUsers().getByUsername(name);
        profile.setName(name);
        profile.setAge(age);
        profile.setHeight(height);
        profile.setWeight(weight);
        profile.setGender(gender);
        profile.setEmail(email);
        profile.update(repo);
    }
}
