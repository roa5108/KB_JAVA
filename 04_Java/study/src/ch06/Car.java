package ch06;

public class Car {
    //private int speed;
    private boolean stop;
    String model;
    boolean start;
    int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public Car() {
    }

    public Car(int speed, boolean stop) {
        this.speed = speed;
        this.stop = stop;
    }
}
