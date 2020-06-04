import java.util.List;
import java.util.stream.IntStream;

public class BowlingScorer {

    private List<Round> rounds;

    public BowlingScorer(List<Round> rounds) {
        this.rounds = rounds;
    }

    public int calculateTotalScores() {
        return IntStream.range(0, 10).map(this::calculateScoresForRound).sum();
    }

    private int calculateScoresForRound(int index) {
       return isStrikeRound(index) ? calculateScoresForStrikeRound(index) :
               isSpareRound(index) ? calculateScoresForSpareRound(index) : calculateScoresForNoBonusRound(index);
    }

    private boolean isStrikeRound(int index) {
        Round round = rounds.get(index);
        return "X".equals(round.getFirstHit());
    }

    private boolean isSpareRound(int index) {
        Round round = rounds.get(index);
         return "/".equals(round.getSecondHit());
    }

    private int getNextOneHitScoreAfterThisRound(int index) {
        return isStrikeRound(index + 1) ? 10 : Integer.parseInt(rounds.get(index + 1).getFirstHit());
    }

    private int getNextTwoHitScoresAfterThisRound(int index) {
        return isStrikeRound(index + 1) ? 10 + getNextOneHitScoreAfterThisRound(index + 1) : getBaseScoresOfRound(index + 1);
    }

    private int calculateScoresForStrikeRound(int index) {
        return getBaseScoresOfRound(index) + getNextTwoHitScoresAfterThisRound(index);
    }

    private int calculateScoresForSpareRound(int index) {
        return getBaseScoresOfRound(index) + getNextOneHitScoreAfterThisRound(index);
    }

    private int calculateScoresForNoBonusRound(int index) {
        return getBaseScoresOfRound(index);
    }

    private int getBaseScoresOfRound(int index) {
        Round round = rounds.get(index);
        return isStrikeRound(index) || isSpareRound(index) ? 10 : Integer.parseInt(round.getFirstHit()) + Integer.parseInt(round.getSecondHit());
    }
}
