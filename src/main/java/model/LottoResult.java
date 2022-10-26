package model;

import java.util.ArrayList;
import java.util.List;

public class LottoResult {

    private List<Rank> result = new ArrayList<>();

    public LottoResult(List<Lotto> lottoList, WinningLotto winningLotto) {
        lottoList.forEach(lotto -> result.add(winningLotto.match(lotto)));
    }

    public int countResult(Rank baseRank) {
        return (int) result.stream()
            .filter(rank -> rank == baseRank)
            .count();
    }

    public int computeWinnings() {
        return result.stream()
            .map(Rank::getWinningMoney)
            .reduce((money1, money2) -> money1 + money2)
            .get();
    }
}
