package com.example.data_example.dto;

public class ApiErrorDTO {

    private int status;
    private String message;

    public ApiErrorDTO(int status, String error) {
        this.status = status;
        this.message = error;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
