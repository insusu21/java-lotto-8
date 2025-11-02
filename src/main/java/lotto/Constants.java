package lotto;

public class Constants {
    private Constants() {
    }
    public static final int LOTTO_SIZE = 6;
    public static final int MIN_LOTTO_NUMBER = 1;
    public static final int MAX_LOTTO_NUMBER = 45;
    public static final int LOTTO_PRICE_UNIT = 1000;

    public static final String PURCHASE_MESSAGE = "%d개를 구매했습니다.";

    public static final String MONEY_INPUT_MESSAGE = "구입금액을 입력해 주세요.";

    public static final String INVALID_ERROR_MESSAGE = "[ERROR] 1000 단위의 숫자를 입력해주세요.";
    public static final String LOTTO_SIZE_ERROR_MESSAGE = "[ERROR] 로또 번호는 6개여야 합니다.";
    public static final String NUMBER_ERROR_MESSAGE = "[ERROR] 1-45 사이의 서로 다른 숫자 6개를 입력해주세요.";


}

