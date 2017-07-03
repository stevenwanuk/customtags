
package com.sven.topic.model;

import java.util.List;

public class Para
{

    public Para() {
        //this.setParaType("ParaList");
    }
    
    private String paraType; 
    
    private List<Para> para = null;

    public List<Para> getPara()
    {
        return para;
    }

    public void setPara(final List<Para> para)
    {
        this.para = para;
    }

    public String getParaType()
    {
        return paraType;
    }

    public void setParaType(final String paraType)
    {
        this.paraType = paraType;
    }

}
