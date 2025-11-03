package lotto;

public class Constants {
    private Constants() {
    }
    public static final int LOTTO_SIZE = 6;
    public static final int MIN_LOTTO_NUMBER = 1;
    public static final int MAX_LOTTO_NUMBER = 45;
    public static final int LOTTO_PRICE_UNIT = 1000;

    public static final String PURCHASE_MESSAGE = "%d개를 구매했습니다.";
    public static final String STATISTICS_HEADER = "\n--- 당첨 통계 ---";
    public static final String STATISTICS_FORMAT = "%d개 일치%s (%,d원) - %d개\n";
    public static final String BONUS_MATCH_TEXT = ", 보너스 볼 일치";
    public static final String RATE_OF_RETURN_MESSAGE = "총 수익률은 %.1f%%입니다.\n";

    public static final String INPUT_MONEY_MESSAGE = "구입금액을 입력해 주세요.";
    public static final String INPUT_WINNING_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";
    public static final String INPUT_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";


    public static final String INVALID_ERROR_MESSAGE = "[ERROR] 1000 단위의 숫자를 입력해주세요.";
    public static final String LOTTO_ERROR_MESSAGE = "[ERROR] 로또 번호는 1-45 사이의 서로 다른 숫자 6개여야 합니다.";
    public static final String WINNING_NUMBER_ERROR_MESSAGE = "[ERROR] 1-45 사이의 서로 다른 숫자 6개를 입력해주세요.";
    public static final String BONUS_NUMBER_ERROR_MESSAGE = "[ERROR] 1-45 사이의 당첨 숫자와 다른 숫자 1개를 입력해주세요.";

}

