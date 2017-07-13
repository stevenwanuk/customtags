package com.sven.topic;

import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.EventFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;

import com.sven.xml.model.Topic;

public class TopicXmlTest
{

    @Test
    public void test_topic() throws Exception
    {
        FileInputStream fisTargetFile =
                new FileInputStream(new ClassPathResource(
                        "simpler-xml-237.xml"
                        ).getFile());

        JAXBContext jaxbContext = JAXBContext.newInstance(Topic.class);

        // strip unwanted whitespace
        XMLInputFactory inputFactory = XMLInputFactory.newInstance();
        XMLEventReader eventReader = inputFactory.createXMLEventReader(
                fisTargetFile);
        eventReader = inputFactory.createFilteredReader(eventReader,
                new WhitespaceFilter());

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Topic topic = (Topic) jaxbUnmarshaller.unmarshal(eventReader);

        List<Object> paras =
                topic.getContent().getSection().get(0).getSectionText().getParaOrList();

        System.out.println(paras);
    }
}

class WhitespaceFilter implements EventFilter {
    @Override
    public boolean accept(final XMLEvent event) {
      return !(event.isCharacters() && ((Characters) event)
          .isWhiteSpace());
    }
  }
