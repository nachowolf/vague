package com.daedalus.vague.response;

public class Response {
    private Status status;
    private String description;
    private Object data;

    public Response() {
    }

    public Response(Status status, Object data) {
        this.status = status;
        this.data = data;
    }

    public Response(Status status, Object data, String description) {
        this.status = status;
        this.data = data;
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public Object getData() {
        return data;
    }

    public String getDescription() {
        return description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
