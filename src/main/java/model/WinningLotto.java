package model;

/**
 * 당첨 번호를 담당하는 객체
 */
public class WinningLotto {

    private final Lotto lotto;
    private final int bonusNo;

    public WinningLotto(Lotto lotto, int bonusNo) {
        this.lotto = lotto;
        this.bonusNo = bonusNo;
    }

    public Rank match(Lotto userLotto) {
        return Rank.valueOf(lotto.matchCount(userLotto.get()), lotto.isMatch(bonusNo));
    }
}
