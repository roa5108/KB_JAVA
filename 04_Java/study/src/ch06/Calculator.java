package ch06;

public class Calculator {
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    int plus(int a, int b) {
        return a + b;
    }

    double divide(int a, int b) {
        return (double) a / (double) b;
    }

    void powerOff() {
        System.out.println("전원을 끕니다.");
    }

    public Calculator() {
    }

    double areaRectangle(int a) {
        return a * a;
    }

    double areaRectangle(int a, int b) {
        return a * b;
    }
}
