package controller;

import model.PayingMoney;
import view.InputView;

public class LottoController {

    public static void run() {
        PayingMoney payingMoney = InputView.requestPayingMoney();
    }
}
