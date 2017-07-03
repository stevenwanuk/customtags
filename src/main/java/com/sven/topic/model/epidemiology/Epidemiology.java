package com.sven.topic.model.epidemiology;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.sven.topic.model.Para;


public class Epidemiology
{

    @SerializedName("para")
    @Expose
    private List<Para> para = null;

    public List<Para> getPara() {
        return para;
    }

    public void setPara(final List<Para> para) {
        this.para = para;
    }
}
