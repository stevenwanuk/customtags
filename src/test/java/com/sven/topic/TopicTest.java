package com.sven.topic;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sven.topic.convertor.ParaConvertor;
import com.sven.topic.model.Para;
import com.sven.topic.model.TopicEntity;
import com.sven.topic.model.epidemiology.EpidemiologyEntity;

public class TopicTest
{

    @Test
    public void test_epidemiology() throws Exception
    {

        FileInputStream fisTargetFile =
                new FileInputStream(new File(
                        "C:\\workspace\\customtags\\src\\main\\resources\\epidemiology-237.json"));

        String topicJson = IOUtils.toString(fisTargetFile, "UTF-8");

        Gson gson = new GsonBuilder().registerTypeAdapter(Para.class,
                new ParaConvertor()).create();

        // deserialize
        EpidemiologyEntity topic = gson.fromJson(topicJson,
                EpidemiologyEntity.class);

        List<Para> paras =
                topic.getEpidemiology().getPara();

//        // serialize
//
//        final TypeToken<List<Para>> paraTypeToken =
//                new TypeToken<List<Para>>()
//                {
//                };
//
//        final RuntimeTypeAdapterFactory<Para> typeFactory =
//                RuntimeTypeAdapterFactory.of(Para.class, "paraType").registerSubtype(
//                        ParaContent.class, "ParaContent").registerSubtype(
//                                ParaReference.class, "ParaReference");
//                //.registerSubtype(List.class, "ParaList");
//
//        final Gson gson2 = new GsonBuilder().registerTypeAdapterFactory(
//                typeFactory).create();
//
//        final String serialized = gson2.toJson(paras,
//                paraTypeToken.getType());
//
//        System.out.println("Serialized JSON: " + serialized);
    }

    public void test() throws Exception
    {

        FileInputStream fisTargetFile =
                new FileInputStream(new File(
                        "C:\\workspace\\customtags\\src\\main\\resources\\simpler-json-1083.json"));

        String topicJson = IOUtils.toString(fisTargetFile, "UTF-8");

        Gson gson = new GsonBuilder().registerTypeAdapter(Para.class,
                new ParaConvertor()).create();
        TopicEntity topic = gson.fromJson(topicJson,
                TopicEntity.class);

        List<Para> paras =
                topic.getTopic().getContent().getSummary().getSection().getSectionText().getPara();
        System.out.println(paras);

    }
}
