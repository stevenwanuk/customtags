
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PocCitation {

    @SerializedName("citation")
    @Expose
    private Citation citation;

    public Citation getCitation() {
        return citation;
    }

    public void setCitation(Citation citation) {
        this.citation = citation;
    }

    public PocCitation withCitation(Citation citation) {
        this.citation = citation;
        return this;
    }

}
