package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.helper;


import static com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.filters.ExceptionsDefineder.NETWORK_ERROR;

import android.os.AsyncTask;

import com.is1431_prm392_group_project.is1431_prm392_group_project.BuildConfig;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.filters.BaseHttpException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class APIHelper extends AsyncTask<String,Integer,JsonObjectResponse> {
    private String BaseUrl;

    /*
     *Constructor sets BaseUrl
     */
    public APIHelper() {
        this.BaseUrl = BuildConfig.API_KEY;
    }

    @Override
    protected JsonObjectResponse doInBackground(String... strings) {
        return null;
    }


    public String CallAPI(String URL, String METHOD, String BODY) throws BaseHttpException {
        String respone = "";
        try {
            /*
             * Open an HTTP Connection to the Logon.ashx page
             */
            HttpURLConnection conn = (HttpURLConnection) ((new URL(BaseUrl + URL).openConnection()));
            conn.setDoOutput(true);
            conn.setRequestMethod(METHOD);
            conn.setRequestProperty("Content-Type", "application/json");
            OutputStream os = conn.getOutputStream();
            os.write(BODY.getBytes());
            os.flush();
            String output;
            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        (conn.getErrorStream())));
                while ((output = br.readLine()) != null) {
                    respone = respone + output;
                }
            } else {
                BufferedReader br = new BufferedReader(new InputStreamReader(
                        (conn.getInputStream())));
                while ((output = br.readLine()) != null) {
                    respone = respone + output;
                }
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw NETWORK_ERROR;
        } catch (IOException e) {
            e.printStackTrace();
            throw NETWORK_ERROR;
        }
        return respone;
    }

    public String DoPost(String URL, String BODY) throws BaseHttpException {
        return this.CallAPI(URL, "POST", BODY);
    }

    public String DoGet(String URL, String BODY) throws BaseHttpException {
        return this.CallAPI(URL, "GET", BODY);
    }
}