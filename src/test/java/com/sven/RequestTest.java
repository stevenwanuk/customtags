package com.sven;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import com.sven.subtype.LoginRequest;
import com.sven.subtype.PingRequest;
import com.sven.subtype.Request;

public class RequestTest
{
    @Test
    public void testPolymorphicSerializeDeserializeWithGSON() throws Exception
    {
        final TypeToken<List<Request>> requestListTypeToken =
                new TypeToken<List<Request>>()
                {
                };

        final RuntimeTypeAdapterFactory<Request> typeFactory =
                RuntimeTypeAdapterFactory.of(Request.class, "type").registerSubtype(
                        LoginRequest.class).registerSubtype(PingRequest.class);

        final Gson gson = new GsonBuilder().registerTypeAdapterFactory(
                typeFactory).create();

        final List<Request> requestList = Arrays.asList(new LoginRequest(
                "bob.villa", "passw0rd"), new LoginRequest("nantucket.jones",
                        "crabdip"),
                new PingRequest("example.com", 5));

        final String serialized = gson.toJson(requestList,
                requestListTypeToken.getType());
        System.out.println("Original List: " + requestList);
        System.out.println("Serialized JSON: " + serialized);

        final List<Request> deserializedRequestList = gson.fromJson(serialized,
                requestListTypeToken.getType());

        System.out.println("Deserialized list: " + deserializedRequestList);
    }
}
