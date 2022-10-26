package view;

import java.util.Scanner;
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
        requestWinningNum();

        return null;
    }

    private static Lotto requestWinningNum() {
        OutputView.printRequestWinningNum();
        return new Lotto(scanner.nextLine());
    }
}
