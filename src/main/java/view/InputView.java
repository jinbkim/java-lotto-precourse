package view;

import java.util.Scanner;
import model.PayingMoney;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static PayingMoney requestPayingMoney() {
        OutputView.printRequestPayingMoney();
        return new PayingMoney(scanner.nextLine());
    }
}
