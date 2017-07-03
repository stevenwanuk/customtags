
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Synonym {

    @SerializedName("@displayable")
    @Expose
    private Boolean displayable;
    @SerializedName("$")
    @Expose
    private String text;

    public Boolean getDisplayable() {
        return displayable;
    }

    public void setDisplayable(final Boolean displayable) {
        this.displayable = displayable;
    }

    public Synonym withDisplayable(final Boolean displayable) {
        this.displayable = displayable;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public Synonym withText(final String text) {
        this.text = text;
        return this;
    }

}
