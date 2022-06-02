package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.providers;

public interface IAuthService {
    public default boolean login(String username, String password) {
        return false;
    }
}
