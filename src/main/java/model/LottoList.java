package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import view.OutputView;

public class LottoList {

    private static final int LOTTO_PRICE = 1000;
    private static final String LOTTO_LIST_DELIMITER = "\n";

    private final List<Lotto> lottoList = new ArrayList<>();

    public LottoList(int payingMoney) {
        int lottoCount = payingMoney / LOTTO_PRICE;

        OutputView.printBuyLotto(lottoCount);
        IntStream.range(0, lottoCount)
            .forEach(i -> lottoList.add(new Lotto()));
    }

    @Override
    public String toString() {
        return lottoList.stream()
            .map(Lotto::toString)
            .collect(Collectors.joining(LOTTO_LIST_DELIMITER));
    }

    public List<Lotto> get() {
        return lottoList;
    }
}
