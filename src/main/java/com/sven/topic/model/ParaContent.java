package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParaContent extends Para
{
    @SerializedName("$")
    @Expose
    private String text;
    
    public ParaContent() {
        this.setParaType("ParaContent");
    }
    
    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }
}
