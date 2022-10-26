package view;

public class OutputView {

    private static final String REQUEST_PAYING_MONEY = "구입금액을 입력해 주세요.";
    private static final String WRONG_PAYING_MONEY = "잘못된 구입금액 입니다.";
    private static final String BUY_LOTTO = "개를 구매했습니다.";
    private static final String REQUEST_WINNING_LOTTO = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String REQUEST_BONUS_BALL = "보너스 볼을 입력해 주세요.";
    private static final String WRONG_WINNING_LOTTO = "잘못된 당첨 번호 형식 입니다.";
    private static final String WRONG_BONUS_BALL = "잘못된 보너스볼 형식 입니다.";

    public static void printRequestPayingMoney() {
        System.out.println(REQUEST_PAYING_MONEY);
    }

    public static void printWrongPayingMoney() {
        System.out.println(WRONG_PAYING_MONEY);
    }

    public static void printBuyLotto(int lottoCount) {
        System.out.println(lottoCount + BUY_LOTTO);
    }

    public static void printRequestWinningLotto() {
        System.out.println(REQUEST_WINNING_LOTTO);
    }

    public static void printRequestBonusBall() {
        System.out.println(REQUEST_BONUS_BALL);
    }

    public static void printWrongWinningLotto() {
        System.out.println(WRONG_WINNING_LOTTO);
    }

    public static void printWrongBonusBall() {
        System.out.println(WRONG_BONUS_BALL);
    }

}
