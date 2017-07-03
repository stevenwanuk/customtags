
package com.sven.topic.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DiseaseSubtypes {

    @SerializedName("subtype")
    @Expose
    private List<Subtype> subtype = null;

    public List<Subtype> getSubtype() {
        return subtype;
    }

    public void setSubtype(List<Subtype> subtype) {
        this.subtype = subtype;
    }

    public DiseaseSubtypes withSubtype(List<Subtype> subtype) {
        this.subtype = subtype;
        return this;
    }

}
