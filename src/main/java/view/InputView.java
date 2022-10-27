package view;

import java.util.List;
import java.util.Scanner;
import model.BonusBall;
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
        Lotto winningLotto = requestWinningNum();
        BonusBall bonusBall = requestBonusBall(winningLotto.get());

        return new WinningLotto(winningLotto, bonusBall.getBonusBall());
    }

    private static Lotto requestWinningNum() {
        OutputView.printRequestWinningNum();
        try {
            return new Lotto(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            OutputView.printWrongWinningNum();
            return requestWinningNum();
        }
    }

    private static BonusBall requestBonusBall(List<Integer> winningNums) {
        OutputView.printRequestBonusBall();
        try {
            return new BonusBall(scanner.nextLine(), winningNums);
        } catch (IllegalArgumentException e) {
            OutputView.printWrongBonusBall();
            return requestBonusBall(winningNums);
        }
    }
}
