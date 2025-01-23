package com.example.softserve_test_task_java.utils;

import java.util.HashSet;
import java.util.Optional;
import java.util.stream.IntStream;

public class DuplicatedCharactersValidator {

    @Deprecated
    public static String simpleDeleteDuplicatesFrom(String givenString) {

        var validator= new HashSet<Character>();
        var result = new StringBuilder();

        for (char character : givenString.toCharArray()){
            if(validator.add(character)){
                result.append(character);
            }
        }

        return result.toString();
    }

    public static String optimizedDeleteDuplicatesFrom(String givenString) {
        return Optional.ofNullable(givenString)
                .map(s -> s.chars()//Getting a stream with the ascii values of the characters
                            .distinct()
                            .mapToObj(character -> (char) character)//Getting a stream of characters back after deleting duplicated ascii codes
                            .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                            .toString())
                .orElse("");

    }
}
