package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.providers;

import android.content.Context;

import com.is1431_prm392_group_project.is1431_prm392_group_project.dao.Repo;
import com.is1431_prm392_group_project.is1431_prm392_group_project.models.entity.user.User;

public class AuthService implements IAuthService {
    Repo repo;

    public AuthService(Context context) {
        repo = new Repo(context);
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
