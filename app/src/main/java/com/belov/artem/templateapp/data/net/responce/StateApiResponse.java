package com.belov.artem.templateapp.data.net.responce;

import com.google.gson.annotations.SerializedName;

public class StateApiResponse {

    @SerializedName("total")
    public int total;

    @SerializedName("per_page")
    public int perPage;

    @SerializedName("current_page")
    public int currentPage;

    @SerializedName("last_page")
    public int lastPage;

    @SerializedName("next_page_url")
    public String nextPageUrl;

    @SerializedName("prev_page_url")
    public String prevPageUrl;

    @SerializedName("from")
    public int from;

    @SerializedName("to")
    public int to;

}
