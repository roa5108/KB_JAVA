package ch08;

public class MultiInterfaceImplExample {
    public static void main(String[] args) {
        RemoteControl2 rc=new SmartTelevision();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable=new SmartTelevision();
        searchable.search("https://www.youtube.com");
    }
}
