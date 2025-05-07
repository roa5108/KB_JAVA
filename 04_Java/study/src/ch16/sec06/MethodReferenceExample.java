package ch16.sec06;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.ordering(String::compareToIgnoreCase);
    }
}
