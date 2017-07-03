
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Section {

    @SerializedName("section-text")
    @Expose
    private SectionText sectionText;

    public SectionText getSectionText() {
        return sectionText;
    }

    public void setSectionText(SectionText sectionText) {
        this.sectionText = sectionText;
    }

    public Section withSectionText(SectionText sectionText) {
        this.sectionText = sectionText;
        return this;
    }

}
