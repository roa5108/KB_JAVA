package ch08.advanced;

public class Taxi implements Vehicle {
    @Override
    public void run() {
        System.out.println(
                "Taxi is running..."
        );
    }
}
