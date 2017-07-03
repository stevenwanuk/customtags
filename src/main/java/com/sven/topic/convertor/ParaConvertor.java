package com.sven.topic.convertor;

import java.lang.reflect.Type;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.sven.topic.model.Para;
import com.sven.topic.model.ParaContent;
import com.sven.topic.model.ParaFigure;
import com.sven.topic.model.ParaReference;

public class ParaConvertor implements JsonDeserializer<Para>, JsonSerializer<Para>
{

    @Override
    public Para deserialize(final JsonElement json, final Type typeOfT,
            final JsonDeserializationContext context) throws JsonParseException
    {

        Para para = read(null, json);

        return para;
    }

    protected Para read(final Para para, final JsonElement json)
    {

        if (json.isJsonArray())
        {

            JsonArray jsonArray = json.getAsJsonArray();
            return this.readArrays(null, jsonArray);

        }
        else if (json.isJsonObject())
        {

            JsonObject jsonObject = json.getAsJsonObject();
            return this.read(null, jsonObject);
        }
        else
        {
            return para;
        }
    }

    protected Para readArrays(final Para para, final JsonArray array)
    {

        return null;
    }

    protected Para readJsonObject(final Para para, final JsonObject jsonObject)
    {

        return null;
    }

    protected ParaContent readParaContent(final Para para, final JsonObject jsonObject)
    {

        return null;
    }

    protected ParaReference readParaReference(final Para para, final JsonObject jsonObject)
    {

        return null;
    }

    protected ParaFigure readParaFigure(final Para para, final JsonObject jsonObject)
    {
        return null;
    }

    @Override
    public JsonElement serialize(final Para src, final Type typeOfSrc,
            final JsonSerializationContext context)
    {

        // TODO Auto-generated method stub
        return null;
    }

}
