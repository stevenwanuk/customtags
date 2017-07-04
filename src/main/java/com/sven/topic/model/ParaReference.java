package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ParaReference extends Para
{
    @SerializedName("reference")
    @Expose
    private Reference reference;

    public Reference getReference()
    {
        return reference;
    }

    public void setReference(final Reference reference)
    {
        this.reference = reference;
    }
}
