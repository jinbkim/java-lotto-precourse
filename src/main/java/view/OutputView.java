package view;

import model.LottoResult;
import model.Rank;

public class OutputView {

    private static final String REQUEST_PAYING_MONEY = "구입금액을 입력해 주세요.";
    private static final String BUY_LOTTO = "개를 구매했습니다.";
    private static final String REQUEST_WINNING_NUM = "지난 주 당첨 번호를 입력해 주세요.";
    private static final String REQUEST_BONUS_BALL = "보너스 볼을 입력해 주세요.";
    private static final String WINNING_STATS = "당첨 통계\n----------";
    private static final String THREE_MATCH = "3개 일치 (5000원) - ";
    private static final String FOUR_MATCH = "4개 일치 (50000원) - ";
    private static final String FIVE_MATCH = "5개 일치 (1500000원) - ";
    private static final String FIVE_AND_BONUS_BALL_MATCH = "5개 일치, 보너스 볼 일치 (30000000원) - ";
    private static final String SIX_MATCH = "6개 일치 (2000000000원) - ";
    private static final String COUNT = "개";

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

    public static void printResult(LottoResult lottoResult) {
        System.out.println(WINNING_STATS);
        System.out.println(THREE_MATCH + lottoResult.countRank(Rank.FIFTH) + COUNT);
        System.out.println(FOUR_MATCH + lottoResult.countRank(Rank.FOURTH) + COUNT);
        System.out.println(FIVE_MATCH + lottoResult.countRank(Rank.THIRD) + COUNT);
        System.out.println(FIVE_AND_BONUS_BALL_MATCH + lottoResult.countRank(Rank.SECOND) + COUNT);
        System.out.println(SIX_MATCH + lottoResult.countRank(Rank.FIRST) + COUNT);
    }
}
