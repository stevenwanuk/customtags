package com.sven.topic;

import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import com.sven.topic.convertor.ParaConvertor;
import com.sven.topic.model.Para;
import com.sven.topic.model.ParaContent;
import com.sven.topic.model.ParaReference;
import com.sven.topic.model.TopicEntity;
import com.sven.topic.model.epidemiology.EpidemiologyEntity;

public class TopicTest
{

    //@Test
    public void test_epidemiology() throws Exception
    {

        FileInputStream fisTargetFile =
                new FileInputStream(new ClassPathResource(
                        "epidemiology-237.json"
                        ).getFile());

        String topicJson = IOUtils.toString(fisTargetFile, "UTF-8");

        Gson gson = new GsonBuilder().registerTypeAdapter(Para.class,
                new ParaConvertor()).create();

        // deserializesss
        EpidemiologyEntity topic = gson.fromJson(topicJson,
                EpidemiologyEntity.class);

        List<Para> paras =
                topic.getEpidemiology().getPara();

        // serialize

        final TypeToken<List<Para>> paraTypeToken =
                new TypeToken<List<Para>>()
                {
                };

        final RuntimeTypeAdapterFactory<Para> typeFactory =
                RuntimeTypeAdapterFactory.of(Para.class,
                        "type").registerSubtype(
                                ParaContent.class).registerSubtype(
                                        ParaReference.class).registerSubtype(Para.class);

        final Gson gson2 = new GsonBuilder().registerTypeAdapterFactory(
                typeFactory).create();

        final String serialized = gson2.toJson(paras,
                paraTypeToken.getType());

        System.out.println("Serialized JSON: " + serialized);
    }

    @Test
    public void test_topic() throws Exception
    {

        FileInputStream fisTargetFile =
                new FileInputStream(new ClassPathResource(
                        "simpler-json-1083.json"
                        ).getFile());

        String topicJson = IOUtils.toString(fisTargetFile, "UTF-8");

        Gson gson = new GsonBuilder().registerTypeAdapter(Para.class,
                new ParaConvertor()).create();

        // deserializesss
        TopicEntity topic = gson.fromJson(topicJson,
                TopicEntity.class);

        List<Para> paras =
                topic.getTopic().getContent().getSummary().getSection().getSectionText().getPara();

        // serialize

        final TypeToken<List<Para>> paraTypeToken =
                new TypeToken<List<Para>>()
                {
                };

        final RuntimeTypeAdapterFactory<Para> typeFactory =
                RuntimeTypeAdapterFactory.of(Para.class,
                        "type").registerSubtype(
                                ParaContent.class).registerSubtype(
                                        ParaReference.class).registerSubtype(Para.class);

        final Gson gson2 = new GsonBuilder().registerTypeAdapterFactory(
                typeFactory).create();

        final String serialized = gson2.toJson(topic);

        System.out.println("Serialized JSON: " + serialized);
    }
}
