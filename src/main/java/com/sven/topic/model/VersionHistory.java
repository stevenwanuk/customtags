
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VersionHistory {

    @SerializedName("version")
    @Expose
    private Version version;

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public VersionHistory withVersion(Version version) {
        this.version = version;
        return this;
    }

}
