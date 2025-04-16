package ch06;

public class CarExample2 {
    public static void main(String[] args) {
        Car3 car = new Car3();
        car.setGas(5);

        if (car.isLeftGas()) {
            System.out.println("출발합니다.");

            car.run();
        }
        System.out.println("gas를 주입하세요.");
    }
}
