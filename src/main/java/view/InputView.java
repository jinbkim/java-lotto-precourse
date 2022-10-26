package view;

import java.util.Scanner;
import model.BonusNum;
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
        BonusNum bonusNum = requestBonusNum(pastWinningLotto);

        return new WinningLotto(pastWinningLotto, bonusNum.getNum());
    }

    private static Lotto requestPastWinningLotto() {
        OutputView.printRequestWinningLotto();
        try {
            return new Lotto(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            OutputView.printWrongWinningLotto();
            return requestPastWinningLotto();
        }
    }

    private static BonusNum requestBonusNum(Lotto pastWinningLotto) {
        OutputView.printRequestBonusBall();
        try {
            return new BonusNum(pastWinningLotto, scanner.nextLine());
        } catch (IllegalArgumentException e) {
            OutputView.printWrongBonusBall();
            return requestBonusNum(pastWinningLotto);
        }
    }

}
