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

        System.out.println(lottoList);

        WinningLotto winningLotto = InputView.requestWinningLotto();
        LottoResult lottoResult = new LottoResult();

        lottoList.get()
            .forEach(lotto -> lottoResult.add(winningLotto.match(lotto)));
        OutputView.printResult(lottoResult);
    }
}
