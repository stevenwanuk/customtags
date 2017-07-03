package com.sven.topic.convertor;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.sven.topic.model.Para;
import com.sven.topic.model.ParaContent;
import com.sven.topic.model.ParaReference;

public class ParaConvertor implements JsonDeserializer<Para>//, JsonSerializer<Para>
{

    @Override
    public Para deserialize(final JsonElement json, final Type typeOfT,
            final JsonDeserializationContext context) throws JsonParseException
    {
        Para para = new Para();

        read(para, json);
        return para;
    }

    protected void read(final Para parent, final JsonElement json)
    {

        if (json.isJsonArray())
        {

            JsonArray jsonArray = json.getAsJsonArray();
            this.readArrays(parent, jsonArray);

        }
        else if (json.isJsonObject())
        {

            JsonObject jsonObject = json.getAsJsonObject();
            this.readJsonObject(parent, jsonObject);
        }
    }

    protected void readArrays(final Para parent, final JsonArray array)
    {
        
        //List<Para> children = new ArrayList<>();
        for (JsonElement jsonElement : array)
        {

            //Para child = new Para();
            //children.add(child);
            this.read(parent, jsonElement);
            

        }

//        if (children.size() > 0)
//        {
//            parent.setPara(children);
//        }
    }

    protected void readJsonObject(final Para parent, final JsonObject jsonObject)
    {
        
        if (jsonObject.has("$")) {
            readParaContent(parent, jsonObject);
        } 
        if (jsonObject.has("reference")) {
            readParaReference(parent, jsonObject); 
        }
    }

    protected void readParaContent(final Para parent, final JsonObject jsonObject)
    {
        ParaContent content = new Gson().fromJson(jsonObject, ParaContent.class);
        
        if (parent.getPara() == null) {
        
            List<Para> list = new ArrayList<>();
            parent.setPara(list);
        }
        
        parent.getPara().add(content);
    }

    protected void readParaReference(final Para parent, final JsonObject jsonObject)
    {
        
        ParaReference reference = new Gson().fromJson(jsonObject, ParaReference.class);
        
        if (parent.getPara() == null) {
            
            List<Para> list = new ArrayList<>();
            parent.setPara(list);
        }
        
        parent.getPara().add(reference);
    }

    protected void readParaFigure(final Para para, final JsonObject jsonObject)
    {
        
    }

//    @Override
//    public JsonElement serialize(final Para src, final Type typeOfSrc,
//            final JsonSerializationContext context)
//    {
//
//        // TODO Auto-generated method stub
//        return null;
//    }

}
