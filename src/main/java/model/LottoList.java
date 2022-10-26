package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import view.OutputView;

public class LottoList {

    private static final int LOTTO_PRICE = 1000;
    private static final String LOTTO_STRING_JOIN_DELIMITER = "\n";

    private final List<Lotto> lottoList = new ArrayList<>();

    public LottoList(int payingMoney) {
        int lottoCount = payingMoney / LOTTO_PRICE;

        IntStream.rangeClosed(0, lottoCount)
            .forEach(i -> lottoList.add(new Lotto()));
        OutputView.printBuyLotto(lottoCount);
        System.out.println(this);
    }

    @Override
    public String toString() {
        return lottoList.stream()
            .map(lotto -> lotto.toString())
            .collect(Collectors.joining(LOTTO_STRING_JOIN_DELIMITER));
    }
}
