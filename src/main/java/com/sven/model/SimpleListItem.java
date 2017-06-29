package com.sven.model;

import javax.annotation.Generated;

public class SimpleListItem
{
    private String title;
    private String description;

    @Generated("SparkTools")
    private SimpleListItem(final Builder builder)
    {
        this.title = builder.title;
        this.description = builder.description;
    }

    public String getTitle()
    {
        return title;
    }
    public void setTitle(final String title)
    {
        this.title = title;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(final String description)
    {
        this.description = description;
    }
    /**
     * Creates builder to build {@link SimpleListItem}.
     * @return created builder
     */
    @Generated("SparkTools")
    public static Builder builder()
    {
        return new Builder();
    }
    /**
     * Builder to build {@link SimpleListItem}.
     */
    @Generated("SparkTools")
    public static final class Builder
    {
        private String title;
        private String description;

        private Builder()
        {
        }

        public Builder withTitle(final String title)
        {
            this.title = title;
            return this;
        }

        public Builder withDescription(final String description)
        {
            this.description = description;
            return this;
        }

        public SimpleListItem build()
        {
            return new SimpleListItem(this);
        }
    }
    
    

}
