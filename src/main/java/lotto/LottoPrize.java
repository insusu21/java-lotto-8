package lotto;

public enum LottoPrize {
    FIFTH(3, 5000, false),
    FOURTH(4, 50000, false),
    THIRD(5, 1500000, false),
    SECOND(5, 30000000, true),
    FIRST(6, 2000000000, false),
    LOSE(0, 0, false);

    private final int matchCount;
    private final int prize;
    private final boolean isBonus;

    private int count = 0;

    LottoPrize(int matchCount, int prize, boolean isBonus) {
        this.matchCount = matchCount;
        this.prize = prize;
        this.isBonus = isBonus;
    }

    public void increaseCount() {
        this.count++;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public int getPrize() {
        return prize;
    }

    public int getCount() {
        return count;
    }

    public boolean isBonusRequired() {
        return isBonus  ;
    }
    public static LottoPrize valueOf(int matchCount, boolean isBonus) {
        if (matchCount == 6) {return FIRST;}
        if (matchCount == 5) {
            if (isBonus) {return SECOND;}
            return THIRD;
        }
        if (matchCount == 4) {return FOURTH;}
        if (matchCount == 3) {return FIFTH;}
        return LOSE;
    }
}
