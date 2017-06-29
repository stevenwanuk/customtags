package com.sven.model;

import java.util.List;

import javax.annotation.Generated;

public class SimpleTitleList
{
    private String title;
    private List<SimpleListItem> list;
    @Generated("SparkTools")
    private SimpleTitleList(final Builder builder)
    {
        this.title = builder.title;
        this.list = builder.list;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(final String title)
    {
        this.title = title;
    }

    public List<SimpleListItem> getList()
    {
        return list;
    }
    public void setList(final List<SimpleListItem> list)
    {
        this.list = list;
    }
    /**
     * Creates builder to build {@link SimpleTitleList}.
     * @return created builder
     */
    @Generated("SparkTools")
    public static Builder builder()
    {
        return new Builder();
    }
    /**
     * Builder to build {@link SimpleTitleList}.
     */
    @Generated("SparkTools")
    public static final class Builder
    {
        private String title;
        private List<SimpleListItem> list;

        private Builder()
        {
        }

        public Builder withTitle(final String title)
        {
            this.title = title;
            return this;
        }

        public Builder withList(final List<SimpleListItem> list)
        {
            this.list = list;
            return this;
        }

        public SimpleTitleList build()
        {
            return new SimpleTitleList(this);
        }
    }
    
    
}
