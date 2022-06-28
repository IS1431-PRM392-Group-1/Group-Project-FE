package com.is1431_prm392_group_project.is1431_prm392_group_project.modules.common.filters;

public class ExceptionsDefineder {
    public static BaseUserException USER_NOT_FOUND = new BaseUserException("USER_NOT_FOUND");
    public static BaseHttpException HTTP_SENDING_ERROR = new BaseHttpException("HTTP_SENDING_ERROR");
}
