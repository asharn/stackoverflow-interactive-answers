package com.question.answer.json;


import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*Gson gson = new Gson();
        Object[] r = gson.fromJson(loadDataAsString(), Object[].class);
        AllEvents allEvents = new AllEvents();
        allEvents.events = gson.fromJson(gson.toJson(r[0]), Event[].class);
        allEvents.statuses = gson.fromJson(gson.toJson(r[1]), Status[].class);
        allEvents.events = Arrays.stream(r)
                .flatMap(x -> Arrays.stream(gson.fromJson(gson.toJson(x), Event[].class)))
                .filter(y -> y.id != null).toArray(Event[]::new);
        allEvents.statuses = Arrays.stream(r)
                .flatMap(x -> Arrays.stream(gson.fromJson(gson.toJson(x), Status[].class)))
                .filter(y -> y.Status != null).toArray(Status[]::new);
        System.out.println(gson.toJson(allEvents));*/


      /*  StringBuilder sb = new StringBuilder();
        char c ='a';
        Integer i=0;
        sb.insert(i,c);*/


    }

    protected static String loadDataAsString() {
        StringBuilder sb = new StringBuilder();
        char c ='a';
        int i=0;
        sb.insert(i,c);

        try {
            File file = new File("src/main/resources/events.json");
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }

}
