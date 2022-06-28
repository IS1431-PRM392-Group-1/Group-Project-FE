package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.helper;

import static com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.filters.ExceptionsDefineder.HTTP_SENDING_ERROR;

import com.is1431_prm392_group_project.is1431_prm392_group_project.BuildConfig;
import com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.filters.BaseHttpException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class APIHelper {
    private String BaseUrl;

    /*
     *Constructor sets BaseUrl, ResponderUrl and ResponderParameters properties
     */
    public APIHelper() {
        this.BaseUrl = BuildConfig.API_KEY;
    }

    public String DoPost(String URL, String BODY) throws BaseHttpException {
        String output;
        try {
            /*
             * Open an HTTP Connection to the Logon.ashx page
             */
            HttpURLConnection conn = (HttpURLConnection) ((new URL(BaseUrl + URL).openConnection()));
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            OutputStream os = conn.getOutputStream();
            os.write(BODY.getBytes());
            os.flush();
            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw HTTP_SENDING_ERROR;
        } catch (IOException e) {
            e.printStackTrace();
            throw HTTP_SENDING_ERROR;
        }
        return output;
    }

    public String DoGet(String URL, String BODY) throws BaseHttpException {
        String output;
        try {
            /*
             * Open an HTTP Connection to the Logon.ashx page
             */
            HttpURLConnection conn = (HttpURLConnection) ((new URL(BaseUrl + URL).openConnection()));
            conn.setDoOutput(true);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");
            OutputStream os = conn.getOutputStream();
            os.write(BODY.getBytes());
            os.flush();
            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw HTTP_SENDING_ERROR;
        } catch (IOException e) {
            e.printStackTrace();
            throw HTTP_SENDING_ERROR;
        }
        return output;
    }
}