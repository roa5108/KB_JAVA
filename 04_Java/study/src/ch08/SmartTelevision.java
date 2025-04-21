package ch08;

public class SmartTelevision implements RemoteControl2,Searchable {
    @Override
    public void turnOn() {
        System.out.println("TV on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV off");
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void search(String url) {
        System.out.println(url+"을 검색합니다.");
    }
}
