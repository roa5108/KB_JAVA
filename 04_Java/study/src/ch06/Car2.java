package ch06;

public class Car2 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car2(String model, String Color, int maxSpeed) {
        this.model = model;
        this.color = Color;
        this.maxSpeed = maxSpeed;
    }

    public Car2() {
    }

    public Car2(String model) {
        this.model = model;
    }

    public Car2(String model, String color) {
        this.model = model;
        this.color = color;
    }
}
