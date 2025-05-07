package ch16.sec05;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 정적 메소드 참조
        person.action(Computer::staticMethod);

        // 인스턴스 메소드 참조
        Computer com = new Computer();
        person.action(com::instanceMethod);
    }
}
