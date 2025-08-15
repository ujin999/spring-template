package com.projectname.core.response;

import java.util.List;

public record ApiErrorResponse(
        int statusCode,
        String errorCode,
        String message,
        List<ValidationError> errors) {
    public static ApiErrorResponse of(int code, String errorCode, String message) {
        return new ApiErrorResponse(code, errorCode, message, null);
    }

    public static ApiErrorResponse of(int code, String errorCode, String message, List<ValidationError> errors) {
        return new ApiErrorResponse(code, errorCode, message, errors);
    }

    public record ValidationError(String field, String defaultMessage) {}
}
