
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Citation {

    @SerializedName("$")
    @Expose
    private String text;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public Citation withText(final String text) {
        this.text = text;
        return this;
    }

}
