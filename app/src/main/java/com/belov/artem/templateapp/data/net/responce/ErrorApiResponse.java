package com.belov.artem.templateapp.data.net.responce;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;


public class ErrorApiResponse {

    @SerializedName("status")
    public int status;

    @SerializedName("message")
    public String message;

    @SerializedName("fields")
    public Map<String, List<String>> fields;

}
