package view;

import model.LottoResult;
import model.Rank;

public class OutputView {

    private static final String REQUEST_PAYING_MONEY = "구입금액을 입력해 주세요.";
    private static final String WRONG_PAYING_MONEY = "잘못된 구입금액 입니다.";
    private static final String BUY_LOTTO = "개를 구매했습니다.";
    private static final String REQUEST_WINNING_LOTTO = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String REQUEST_BONUS_BALL = "보너스 볼을 입력해 주세요.";
    private static final String WRONG_WINNING_LOTTO = "잘못된 당첨 번호 형식 입니다.";
    private static final String WRONG_BONUS_BALL = "잘못된 보너스볼 형식 입니다.";
    private static final String STATISTICS = "당첨 통계";
    private static final String THREE_MATCH = "3개 일치 (5000원) - ";
    private static final String FOUR_MATCH = "4개 일치 (50000원) - ";
    private static final String FIVE_MATCH = "5개 일치 (1500000원) - ";
    private static final String FIVE_MATCH_WITH_BONUS = "5개 일치, 보너스 볼 일치 (30000000원) - ";
    private static final String SIX_MATCH = "6개 일치 (2000000000원) - ";
    private static final String COUNT = "개";
    private static final String[] TOTAL_YIELD = {"총 수익은 ", "입니다."};


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

    public static void printResult(double payingMoney, LottoResult lottoResult) {
        System.out.println(STATISTICS);
        System.out.println(THREE_MATCH + lottoResult.countResult(Rank.FIFTH) + COUNT);
        System.out.println(FOUR_MATCH + lottoResult.countResult(Rank.FOURTH) + COUNT);
        System.out.println(FIVE_MATCH + lottoResult.countResult(Rank.THIRD) + COUNT);
        System.out.println(FIVE_MATCH_WITH_BONUS + lottoResult.countResult(Rank.SECOND) + COUNT);
        System.out.println(SIX_MATCH + lottoResult.countResult(Rank.FIRST) + COUNT);
        System.out.println(TOTAL_YIELD[0] + lottoResult.winnings() / payingMoney + TOTAL_YIELD[1]);
    }

}
