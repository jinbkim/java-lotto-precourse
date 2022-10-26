package view;

public class OutputView {

    private static final String REQUEST_PAYING_MONEY = "구입금액을 입력해 주세요.";
    private static final String BUY_LOTTO = "개를 구매했습니다.";
    private static final String REQUEST_WINNING_NUM = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String REQUEST_BONUS_BALL = "보너스 볼을 입력해 주세요.";

    public static void printRequestPayingMoney() {
        System.out.println(REQUEST_PAYING_MONEY);
    }

    public static void printBuyLotto(int lottoCount) {
        System.out.println(lottoCount + BUY_LOTTO);
    }

    public static void printRequestWinningNum() {
        System.out.println(REQUEST_WINNING_NUM);
    }

    public static void printRequestBonusBall() {
        System.out.println(REQUEST_BONUS_BALL);
    }

}
