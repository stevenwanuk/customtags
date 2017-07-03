
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Reason {

    @SerializedName("@update-reason")
    @Expose
    private String updateReason;

    public String getUpdateReason() {
        return updateReason;
    }

    public void setUpdateReason(String updateReason) {
        this.updateReason = updateReason;
    }

    public Reason withUpdateReason(String updateReason) {
        this.updateReason = updateReason;
        return this;
    }

}
