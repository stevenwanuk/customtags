
package com.sven.topic.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Synonyms {

    @SerializedName("synonym")
    @Expose
    private List<Synonym> synonym = null;

    public List<Synonym> getSynonym() {
        return synonym;
    }

    public void setSynonym(List<Synonym> synonym) {
        this.synonym = synonym;
    }

    public Synonyms withSynonym(List<Synonym> synonym) {
        this.synonym = synonym;
        return this;
    }

}
