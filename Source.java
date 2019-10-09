package com.pranay.mynews;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Source {
    @SerializedName("id")
    @Expose

    /* renamed from: id */
    private String f68id;
    @SerializedName("name")
    @Expose
    private String name;

    public String getId() {
        return this.f68id;
    }

    public void setId(String id) {
        this.f68id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name2) {
        this.name = name2;
    }
}
