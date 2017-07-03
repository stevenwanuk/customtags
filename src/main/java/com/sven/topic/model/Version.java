
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Version {

    @SerializedName("@date")
    @Expose
    private String date;
    @SerializedName("reason")
    @Expose
    private Reason reason;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Version withDate(String date) {
        this.date = date;
        return this;
    }

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public Version withReason(Reason reason) {
        this.reason = reason;
        return this;
    }

}
