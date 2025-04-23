package ch12.sec03;

public class RecordExample {
    public static void main(String[] args) {
        Member3 m = new Member3("winter", "눈송이", 25);
        System.out.println(m.id());
        System.out.println(m.name());
        System.out.println(m.age());
        System.out.println(m.toString());
        System.out.println();
        Member3 m1 = new Member3("winter", "눈송이", 25);
        Member3 m2 = new Member3("winter", "눈송이", 25);
        System.out.println("m1.hashCode(): " + m1.hashCode());
        System.out.println("m2.hashCode(): " + m2.hashCode());
        System.out.println("m1.equals(m2): " + m1.equals(m2));
    }
}