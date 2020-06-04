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

    private int calculateScoresForStrikeRound(int index) {
        return 10 + calculateScoresForNoBonusRound(index + 1);
    }

    private int calculateScoresForSpareRound(int index) {
        if (index + 1 == rounds.size())
            return 10;

        Round nexRound = rounds.get(index + 1);
        return 10 + Integer.parseInt(nexRound.getFirstHit());
    }

    private int calculateScoresForNoBonusRound(int index) {
        Round round = rounds.get(index);
        return Integer.parseInt(round.getFirstHit()) + Integer.parseInt(round.getSecondHit());
    }
}
