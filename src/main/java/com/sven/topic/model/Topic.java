
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Topic {

    @SerializedName("@dx-id")
    @Expose
    private Integer dxId;
    @SerializedName("@id")
    @Expose
    private String id;
    @SerializedName("@type")
    @Expose
    private String type;
    @SerializedName("@lang")
    @Expose
    private String lang;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("summary")
    @Expose
    private Object summary;
    @SerializedName("content")
    @Expose
    private Content content;

    public Integer getDxId() {
        return dxId;
    }

    public void setDxId(Integer dxId) {
        this.dxId = dxId;
    }

    public Topic withDxId(Integer dxId) {
        this.dxId = dxId;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Topic withId(String id) {
        this.id = id;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Topic withType(String type) {
        this.type = type;
        return this;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Topic withLang(String lang) {
        this.lang = lang;
        return this;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Topic withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Object getSummary() {
        return summary;
    }

    public void setSummary(Object summary) {
        this.summary = summary;
    }

    public Topic withSummary(Object summary) {
        this.summary = summary;
        return this;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Topic withContent(Content content) {
        this.content = content;
        return this;
    }

}
