package com.belov.artem.templateapp.data.net.responce;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ApiResponse<T> {

    @SerializedName("result")
    private T result;

    @SerializedName("errors")
    private List<ErrorApiResponse> errors;

    @SerializedName("state")
    private StateApiResponse state;

    public ApiResponse() {
    }

    public T getResult() {
        return result;
    }

    public List<ErrorApiResponse> getErrors() {
        return errors;
    }

    public StateApiResponse getState() {
        return state;
    }

    public void setErrors(List<ErrorApiResponse> errors) {
        this.errors = errors;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public void setState(StateApiResponse state) {
        this.state = state;
    }

}
