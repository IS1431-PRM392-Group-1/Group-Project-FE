package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.providers;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.entity.user.User;

public class AuthProvider extends IAuthProvider {
    public AuthProvider(Context context) {
        super(context);
    }

    @Override
    public boolean login(String username, String password) {
        User user = repo.Users.getByUsername(username);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }
}
