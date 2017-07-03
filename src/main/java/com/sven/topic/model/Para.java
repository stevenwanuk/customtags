
package com.sven.topic.model;

import java.util.List;

public abstract class Para
{

    private List<Para> para = null;

    public List<Para> getPara()
    {
        return para;
    }

    public void setPara(final List<Para> para)
    {
        this.para = para;
    }

}
