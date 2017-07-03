
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Content {

    @SerializedName("notes")
    @Expose
    private Notes notes;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("disease-subtypes")
    @Expose
    private DiseaseSubtypes diseaseSubtypes;

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public Content withNotes(Notes notes) {
        this.notes = notes;
        return this;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public Content withSummary(Summary summary) {
        this.summary = summary;
        return this;
    }

    public DiseaseSubtypes getDiseaseSubtypes() {
        return diseaseSubtypes;
    }

    public void setDiseaseSubtypes(DiseaseSubtypes diseaseSubtypes) {
        this.diseaseSubtypes = diseaseSubtypes;
    }

    public Content withDiseaseSubtypes(DiseaseSubtypes diseaseSubtypes) {
        this.diseaseSubtypes = diseaseSubtypes;
        return this;
    }

}
