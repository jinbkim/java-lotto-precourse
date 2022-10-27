package model;

import java.util.ArrayList;
import java.util.List;

public class LottoResult {

    private final List<Rank> ranks = new ArrayList<>();

    public LottoResult(List<Lotto> lottoList, WinningLotto winningLotto) {
        lottoList.forEach(lotto -> ranks.add(winningLotto.match(lotto)));
    }

    public int countRank(Rank baseRank) {
        return (int) ranks.stream()
            .filter(rank -> rank == baseRank)
            .count();
    }
}
