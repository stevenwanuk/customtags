
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subtype {

    @SerializedName("name")
    @Expose
    private Name name;
    @SerializedName("detail")
    @Expose
    private Detail detail;

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Subtype withName(Name name) {
        this.name = name;
        return this;
    }

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Subtype withDetail(Detail detail) {
        this.detail = detail;
        return this;
    }

}
