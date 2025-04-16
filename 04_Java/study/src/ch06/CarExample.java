package ch06;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("모델명 : " + myCar.model);
        System.out.println("시동여부 : " + myCar.start);
        System.out.println("현재속도 : " + myCar.speed);

        Car2 myCar2 = new Car2("그랜저", "검정", 250);

        Car2 car1 = new Car2();
        Car2 car2 = new Car2("자가용");
        Car2 car3 = new Car2("자가용", "빨강");
        Car2 car4 = new Car2("택시", "검정", 200);

        System.out.println("car1.company : " + car1.company);
        System.out.println();
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }
}
