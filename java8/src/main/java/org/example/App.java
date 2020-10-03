package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String st = "venu";
        List<String> strings = new ArrayList<String>();
        strings.add("venu");
        strings.add("challa");
        strings.add("venu1");
        strings.add("challa1");
        strings.add("venu2");
        strings.add("challa2");
        strings.add("venu3");
        strings.add("challa3");
        strings.stream().flatMap(new Function<String, Stream<?>>() {
            @Override
            public Stream<?> apply(String s) {
                return null;
            }
        });


        System.out.println("Hello World!");
    }
}
