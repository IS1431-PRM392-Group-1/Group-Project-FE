package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.auth.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AuthnDto {
    public class LoginDto {
        @SerializedName("username")
        @Expose
        private Integer username;
        @SerializedName("password")
        @Expose
        private Integer password;

        public Integer getUsername() {
            return username;
        }

        public void setUsername(Integer username) {
            this.username = username;
        }

        public Integer getPassword() {
            return password;
        }

        public void setPassword(Integer password) {
            this.password = password;
        }
    }

}
