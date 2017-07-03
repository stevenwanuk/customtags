
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reference {

    @SerializedName("poc-citation")
    @Expose
    private PocCitation pocCitation;

    public PocCitation getPocCitation() {
        return pocCitation;
    }

    public void setPocCitation(PocCitation pocCitation) {
        this.pocCitation = pocCitation;
    }

    public Reference withPocCitation(PocCitation pocCitation) {
        this.pocCitation = pocCitation;
        return this;
    }

}
