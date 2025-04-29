package ch15.sec05;

import lombok.Getter;

@Getter
public class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

}
