package ch06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 = " + result1);

        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 = " + result2);

        myCalc.powerOff();

        Calculator myCalc2 = new Calculator();
        double result3 = myCalc2.areaRectangle(10);
        double result4 = myCalc2.areaRectangle(10, 20);
        System.out.println("정사각형 넓이=" + result3);
        System.out.println("직사각형 넓이=" + result4);
    }
}

