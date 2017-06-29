package com.sven.model;

import java.util.List;

import javax.annotation.Generated;

public class CollapsedList
{

    private String id;
    private String title;
    private String description;
    private List<SimpleListItem> list;

    @Generated("SparkTools")
    private CollapsedList(final Builder builder)
    {
        this.id = builder.id;
        this.title = builder.title;
        this.description = builder.description;
        this.list = builder.list;
    }

    public String getDescription()
    {
        return description;
    }



    public void setDescription(final String description)
    {
        this.description = description;
    }



    public String getId()
    {
        return id;
    }

    public void setId(final String id)
    {
        this.id = id;
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
     * Creates builder to build {@link CollapsedList}.
     * @return created builder
     */
    @Generated("SparkTools")
    public static Builder builder()
    {
        return new Builder();
    }

    /**
     * Builder to build {@link CollapsedList}.
     */
    @Generated("SparkTools")
    public static final class Builder
    {
        private String id;
        private String title;
        private String description;
        private List<SimpleListItem> list;

        private Builder()
        {
        }

        public Builder withId(final String id)
        {
            this.id = id;
            return this;
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

        public Builder withList(final List<SimpleListItem> list)
        {
            this.list = list;
            return this;
        }

        public CollapsedList build()
        {
            return new CollapsedList(this);
        }
    }

}
