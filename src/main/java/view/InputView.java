package view;

import java.util.Scanner;
import model.BonusBall;
import model.Lotto;
import model.PayingMoney;
import model.WinningLotto;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static PayingMoney requestPayingMoney() {
        OutputView.printRequestPayingMoney();
        return new PayingMoney(scanner.nextLine());
    }

    public static WinningLotto requestWinningLotto() {
        Lotto winningLotto = requestWinningNum();
        BonusBall bonusBall = requestBonusBall();

        return new WinningLotto(winningLotto, bonusBall.getBonusBall());
    }

    private static Lotto requestWinningNum() {
        OutputView.printRequestWinningNum();
        return new Lotto(scanner.nextLine());
    }

    private static BonusBall requestBonusBall() {
        OutputView.printRequestBonusBall();
        return new BonusBall(scanner.nextLine());
    }
}
