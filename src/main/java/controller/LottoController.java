package controller;

import model.LottoList;
import model.PayingMoney;
import model.WinningLotto;
import view.InputView;

public class LottoController {

    public static void run() {
        PayingMoney payingMoney = InputView.requestPayingMoney();
        LottoList lottoList = new LottoList(payingMoney.getMoney());

        System.out.println(lottoList);

        WinningLotto winningLotto = InputView.requestWinningLotto();
    }
}
