package ch12.sec03;

public class EqualsExample {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("blue");
        Member obj3 = new Member("red");
        if (obj1.equals(obj2)) { // 같은 Member 타입이며 id 동일 → true
            System.out.println("obj1과 obj2는 동등합니다.");
        } else {
            System.out.println("obj1과 obj2는 동등하지 않습니다.");
        }
        if (obj1.equals(obj3)) { // 같은 Member 타입이지만 id가 다름 → true
            System.out.println("obj1과 obj3은 동등합니다.");
        } else {
            System.out.println("obj1과 obj3은 동등하지 않습니다.");
        }
    }
}