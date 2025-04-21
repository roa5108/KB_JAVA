package ch08.advanced;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus run");
    }

    public void checkFare() {
        System.out.println("Check fare");
    }
}
