package com.question.answer.misc;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class Test {
    /*public static void main(String[] args) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = "40+2";
        System.out.println(engine.eval(foo));
    }*//*

    *//*public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Array lists");
        int total_arraylists = input.nextInt();
        ArrayList<Integer> lists[] = new ArrayList[total_arraylists];
        for (int i = 0; i < total_arraylists; i++) {
            lists[i] = new ArrayList<Integer>(i);
            System.out.println("Enter the values");
            while (input.hasNextInt()) {
                lists[i].add(input.nextInt());
            }
            System.out.println(lists[i]);
        }
    }*/
    /*public static void main(String[] args) throws ParseException {
        *//*List<String> animals = Arrays.asList("cat", "dog", "cow", "monkey", "lion", "tiger", null, null, null);
        System.out.println(animals);
        animals.set(6,"bear");
        System.out.println(animals);*//*

        *//*Operator operator = new Plus(2,5);
        operator.print();
        operator = new Subtract(5,2);
        operator.print();*//*
        *//*DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date currentDate = new Date();
        Date alarmSetDate = dateFormat.parse("16:12");
        System.out.println(dateFormat.format(currentDate));
        System.out.println(dateFormat.format(alarmSetDate));
        long diffInMillies = Math.abs(alarmSetDate.getTime() - currentDate.getTime());
        long diffInMinutes = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
        System.out.println(diffInMinutes);*//*



    }*/

    public static void main(String[] args) {
        List<Hospital> list = Arrays.asList(
                new Hospital(AREA.AREA1, 20),
                new Hospital(AREA.AREA2, 10),
                new Hospital(AREA.AREA1, 10),
                new Hospital(AREA.AREA3, 40),
                new Hospital(AREA.AREA2, 10));
        Map<AREA, Integer> map = findTopTen(list);
        for (AREA area : map.keySet())
            System.out.println(area);

    }

    public static Map<AREA, Integer> findTopTen(Iterable<Hospital> iterable) {
        Map<AREA, Integer> map = StreamSupport.stream(iterable.spliterator(), false)
                .collect(Collectors.groupingBy(Hospital::getArea,
                        Collectors.summingInt(Hospital::getPatients)));
        for (Map.Entry<AREA, Integer> area : map.entrySet())
            System.out.println(area.getKey() + "...." + area.getValue());
        return map.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue() - e1.getValue())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue, (o, o2) -> o,
                        LinkedHashMap::new));

    }
}
