
package com.sven.topic.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("para")
    @Expose
    private List<Para> para;

    public List<Para> getPara() {
        return para;
    }

    public void setPara(final List<Para> para) {
        this.para = para;
    }

    public Detail withPara(final List<Para> para) {
        this.para = para;
        return this;
    }

}
