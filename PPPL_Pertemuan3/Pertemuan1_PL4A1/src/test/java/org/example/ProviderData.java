package org.example;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProviderData {
    static Stream<Arguments> provideDataAdd(){
        return Stream.of(
                Arguments.of(5, 10, 15),
                Arguments.of(15, 10, 25),
                Arguments.of(25, 10, 35)
        );
    }
    static Stream<List<String>> providerArray(){
        return Stream.of(
                Arrays.asList("oke", "gas"),
                Arrays.asList("mantap", "jos")
        );
    }
}
