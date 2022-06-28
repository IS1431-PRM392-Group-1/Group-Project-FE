package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.service;

import com.is1431_prm392_group_project.is1431_prm392_group_project.BuildConfig;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.repository.IAuthRepository;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthService {
    private static final String BASE_URL = BuildConfig.API_KEY;
    private static AuthService services;

    public IAuthRepository getAuthApiRepository() {
        return authApiRepository;
    }

    private IAuthRepository authApiRepository;

    private AuthService() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        authApiRepository = retrofit.create(IAuthRepository.class);
    }

    public static AuthService getInstance() {
        if (services == null) {
            services = new AuthService();
        }
        return services;
    }



}
