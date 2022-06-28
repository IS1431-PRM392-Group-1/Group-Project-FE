package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.helper;


public class JsonObjectResponse {
    private int code;
    private String message;
    private Object data;
    private String status;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HttpObject{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data='" + data + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
