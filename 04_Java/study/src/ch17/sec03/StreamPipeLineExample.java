package ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("김길동", 20),
                new Student("최길동", 30)
        );

//        Stream<Student> studentStream = list.stream();
//        IntStream scoreStream = studentStream.mapToInt(Student::getScore);
//        double avg = scoreStream.average().getAsDouble();
//        System.out.println("평균점수:" + avg);

        double avg = list.stream()
                .mapToInt(Student::getScore)
                .average()
                .getAsDouble();
        System.out.println("평균점수:" + avg);
    }
}
