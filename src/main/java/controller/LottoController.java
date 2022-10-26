package controller;

import model.LottoList;
import model.LottoResult;
import model.PayingMoney;
import model.WinningLotto;
import view.InputView;
import view.OutputView;

public class LottoController {

    public static void run() {
        PayingMoney payingMoney = InputView.requestPayingMoney();
        LottoList lottoList = new LottoList(payingMoney.getMoney());
        WinningLotto winningLotto = InputView.requestWinningLotto();
        LottoResult lottoResult = new LottoResult(lottoList.get(), winningLotto);

        OutputView.printResult(payingMoney.getMoney(), lottoResult);
    }
}
