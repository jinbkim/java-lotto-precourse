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
}
