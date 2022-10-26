package model;

import java.util.ArrayList;
import java.util.List;

public class LottoResult {

    private List<Rank> result = new ArrayList<>();

    public void add(Rank rank) {
        result.add(rank);
    }

    public int countResult(Rank baseRank) {
        return (int) result.stream()
            .filter(rank -> rank == baseRank)
            .count();
    }

    public int winnings() {
        int money = 0;

        return result.stream()
            .map(Rank::getWinningMoney)
            .reduce((money1, money2) -> money1 + money2)
            .get();
    }
}
