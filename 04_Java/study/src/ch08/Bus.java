package ch08;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달림");
    }

    public void checkFare() {
        System.out.println("승차요금을 체크");
    }
}
