package com.question.answer.stream;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Cartesian {

    public static void main(String[] args) throws IOException {

        Set<String> set = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> carSet = set
                .stream()
                .map(x-> set
                        .stream()
                        .map(y-> x+y)
                        .collect(Collectors.toSet()))
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());
        System.out.println(carSet);

    }
}


