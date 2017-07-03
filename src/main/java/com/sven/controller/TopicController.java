package com.sven.controller;

import java.io.IOException;

import javax.validation.constraints.NotNull;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sven.topic.convertor.ParaConvertor;
import com.sven.topic.model.Para;
import com.sven.topic.model.TopicEntity;

@RestController
public class TopicController
{
    private static final Logger LOG = Logger.getLogger(TopicController.class);

    @Autowired
    private ResourceLoader resourceLoader;

    @RequestMapping("topic")
    public TopicEntity readTopic()
    {

        Gson gson = new GsonBuilder().registerTypeAdapter(Para.class,
                new ParaConvertor()).create();
        TopicEntity result = gson.fromJson(readFileAsString("simpler-json-1083.json"),
                TopicEntity.class);
        return result;
    }

    /**
     * read file from giving <i>filePath</i> in class path
     * 
     * @param filePath
     * @return
     */
    public String readFileAsString(@NotNull final String filePath)
    {

        LOG.debug("enter readFileAsString() for giving filePath:" + filePath);

        Resource resource =
                resourceLoader.getResource("classpath:" + filePath);

        try
        {
            if (resource.exists())
            {

                String text = IOUtils.toString(resource.getInputStream());
                LOG.debug("exiting readFileAsString() for giving filePath:" + filePath);
                return text;
            }

        }
        catch (IOException e)
        {
            LOG.error("fail to read file:" + filePath, e);
        }

        return null;
    }
}
