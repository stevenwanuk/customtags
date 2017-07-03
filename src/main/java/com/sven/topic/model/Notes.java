
package com.sven.topic.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Notes {

    @SerializedName("para")
    @Expose
    private List<Para> para = null;

    public List<Para> getPara() {
        return para;
    }

    public void setPara(List<Para> para) {
        this.para = para;
    }

    public Notes withPara(List<Para> para) {
        this.para = para;
        return this;
    }

}
