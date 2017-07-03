
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("last-updated")
    @Expose
    private LastUpdated lastUpdated;
    @SerializedName("version-history")
    @Expose
    private VersionHistory versionHistory;
    @SerializedName("synonyms")
    @Expose
    private Synonyms synonyms;
    @SerializedName("categories")
    @Expose
    private Categories categories;

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public Metadata withTitle(Title title) {
        this.title = title;
        return this;
    }

    public LastUpdated getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LastUpdated lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Metadata withLastUpdated(LastUpdated lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }

    public VersionHistory getVersionHistory() {
        return versionHistory;
    }

    public void setVersionHistory(VersionHistory versionHistory) {
        this.versionHistory = versionHistory;
    }

    public Metadata withVersionHistory(VersionHistory versionHistory) {
        this.versionHistory = versionHistory;
        return this;
    }

    public Synonyms getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(Synonyms synonyms) {
        this.synonyms = synonyms;
    }

    public Metadata withSynonyms(Synonyms synonyms) {
        this.synonyms = synonyms;
        return this;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public Metadata withCategories(Categories categories) {
        this.categories = categories;
        return this;
    }

}
