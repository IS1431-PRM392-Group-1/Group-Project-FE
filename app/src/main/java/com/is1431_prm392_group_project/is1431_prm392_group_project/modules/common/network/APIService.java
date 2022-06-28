package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.network;

import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.network.repository.ILoginApiRepository;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIService  {
    private static final String BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static APIService services;

    public ILoginApiRepository getLoginApiRepository() {
        return loginApiRepository;
    }

    private ILoginApiRepository loginApiRepository;

    private APIService() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        loginApiRepository = retrofit.create(ILoginApiRepository.class);
    }

    public static APIService getInstance() {
        if (services == null) {
            services = new APIService();
        }
        return services;
    }



}
