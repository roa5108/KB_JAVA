package ch08;

public interface RemoteControl2 {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
