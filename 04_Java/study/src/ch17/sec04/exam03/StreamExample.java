package ch17.sec04.exam03;

import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        sum = intStream.sum();
        System.out.println("총합:" + sum);
    }
}
