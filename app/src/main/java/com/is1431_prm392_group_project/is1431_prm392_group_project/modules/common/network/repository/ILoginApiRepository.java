package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.network.repository;

import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.network.dto.LoginDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ILoginApiRepository  {

    @POST("auth/login")
    Call<LoginDto> login(@Body LoginDto loginDto);



}