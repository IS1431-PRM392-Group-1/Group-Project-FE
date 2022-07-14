package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.profile.provider;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.user.User;

public class ProfileProvider extends IProfileProvider {
    public ProfileProvider(Context context) {
        super(context);
    }

    public void insertProfile(String name, int age, float height, float weight, String gender, String email) throws Exception {
        User profile = new User();
        profile.setId(1);
        profile.setName(name);
        profile.setAge(age);
        profile.setHeight(height);
        profile.setWeight(weight);
        profile.setGender(gender);
        profile.setEmail(email);
        profile.update(repo);
    }
}
