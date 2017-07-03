package com.sven.topic.model.epidemiology;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EpidemiologyEntity
{

    @SerializedName("epidemiology")
    @Expose
    private Epidemiology epidemiology;

    public Epidemiology getEpidemiology()
    {
        return epidemiology;
    }

    public void setEpidemiology(final Epidemiology epidemiology)
    {
        this.epidemiology = epidemiology;
    }
    
}
