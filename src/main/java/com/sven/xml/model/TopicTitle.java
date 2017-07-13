package com.sven.xml.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "topicTitle"
})
@XmlRootElement(name = "topic-title")
public class TopicTitle
{
    @XmlValue
    protected String topicTitle;

    public String getTopicTitle()
    {
        return topicTitle;
    }

    public void setTopicTitle(final String topicTitle)
    {
        this.topicTitle = topicTitle;
    }
    
}
