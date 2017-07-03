
package com.sven.topic.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TopicEntity {

    @SerializedName("topic")
    @Expose
    private Topic topic;

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    public TopicEntity withTopic(Topic topic) {
        this.topic = topic;
        return this;
    }

}
