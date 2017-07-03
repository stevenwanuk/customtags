
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("@id")
    @Expose
    private Integer id;
    @SerializedName("$")
    @Expose
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Category withId(final Integer id) {
        this.id = id;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public Category withText(final String text) {
        this.text = text;
        return this;
    }

}
