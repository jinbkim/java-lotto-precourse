package view;

import java.util.Scanner;
import model.Lotto;
import model.PayingMoney;
import model.WinningLotto;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static PayingMoney requestPayingMoney() {
        OutputView.printRequestPayingMoney();
        try {
            return new PayingMoney(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            OutputView.printWrongPayingMoney();
            return requestPayingMoney();
        }
    }

    public static WinningLotto requestWinningLotto() {
        Lotto pastWinningLotto = requestPastWinningLotto();
        int bonusNo = requestBonusNum();

        return new WinningLotto(pastWinningLotto, bonusNo);

    }

    private static Lotto requestPastWinningLotto() {
        OutputView.printRequestWinningLotto();
        return new Lotto(scanner.nextLine());
    }

    private static int requestBonusNum() {
        OutputView.printRequestBonusBall();
        return Integer.parseInt(scanner.nextLine());
    }

}
