package ch17.sec01;

import java.util.HashSet;
import java.util.Set;

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        set.stream().forEach(System.out::println);
    }
}
