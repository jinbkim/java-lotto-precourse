package view;

public class OutputView {

    private static final String REQUEST_PAYING_MONEY = "구입금액을 입력해 주세요.";
    private static final String BUY_LOTTO = "개를 구매했습니다.";

    public static void printRequestPayingMoney() {
        System.out.println(REQUEST_PAYING_MONEY);
    }

    public static void printBuyLotto(int lottoCount) {
        System.out.println(lottoCount + BUY_LOTTO);
    }
}
