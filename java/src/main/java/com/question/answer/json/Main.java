package com.question.answer.json;


import com.google.gson.Gson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Object[] r = new Gson().fromJson(loadDataAsString(), Object[].class);
        AllEvents allEvents = new AllEvents();
        allEvents.events = (Event[]) r[0].;
        allEvents.statuses= (Status[]) r[0];
        System.out.println(r);
    }

    protected static String loadDataAsString() {
        try {
            File file = new File("src/main/resources/events.json");
            return new String(Files.readAllBytes(file.toPath()));
        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }

}
