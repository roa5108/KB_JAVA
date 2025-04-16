package ch06;

public class Car4 {
    String model;
    int speed;

    public Car4(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        this.setSpeed(100);
        System.out.println(model + "가 달립니다.(시속:" + speed + " 값)km/h");
    }
}
