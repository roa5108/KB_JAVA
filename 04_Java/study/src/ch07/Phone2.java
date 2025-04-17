package ch07;

public abstract class Phone2 {
    String owner;
    Phone2(String owner) {
        this.owner = owner;
    }
    void turnOn() {
        System.out.println("폰 전원을 켭니다.");
    }
    void turnOff() {
        System.out.println("폰 전원을 끕니다.");
    }

}
