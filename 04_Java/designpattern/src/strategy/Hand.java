package strategy;

public enum Hand {
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);
    private static final Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };
    private final String name; // 가위 바위보 손의 이름
    private final int handvalue; // 가위 바위보 손의 값

    Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue;
    }

    public static Hand getHand(int handvalue) {
        return hands[handvalue];
    }

    // 무승부는 0, this 가 이기면 1, h가 이기면 -1

    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) {
            return 1;
        } else {
            return
                    -1;

        }
    }
// this가 h보다 강할 때 true

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this 가 h보다 약할 때 true
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 가위 바위 보의 문자열 표현
    @Override
    public String toString() {
        return name;
    }
}