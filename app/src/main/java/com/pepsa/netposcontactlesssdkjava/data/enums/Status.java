package com.pepsa.netposcontactlesssdkjava.data.enums;

public enum Status {
    APPROVED("00"),
    OTHERS("");
    private final String statusCode;
    Status(String s) {
        statusCode = s;
    }

    public String getStatusCode() {
        return statusCode;
    }
}
