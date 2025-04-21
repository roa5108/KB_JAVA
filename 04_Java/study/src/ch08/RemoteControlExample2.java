package ch08;

public class RemoteControlExample2 {
    public static void main(String[] args) {
        RemoteControl2 rc2;

        rc2=new Television2();
        rc2.turnOn();
        rc2.setVolume(5);
        rc2.turnOff();

        rc2=new Audio2();
        rc2.turnOn();
        rc2.setVolume(5);
        rc2.turnOff();
    }
}
