import java.util.List;
import java.util.stream.IntStream;

public class BowlingScorer {

    private List<Round> rounds;

    public BowlingScorer(List<Round> rounds) {
        this.rounds = rounds;
    }

    public int calculateTotalScores() {
        return IntStream.range(0, rounds.size()).map(this::calculateScoresForRound).sum();
    }

    private int calculateScoresForRound(int index) {
        Round round = rounds.get(index);
       return  "/".equals(round.getSecondHit()) ? 10 + Integer.parseInt(rounds.get(index + 1).getFirstHit()) : Integer.parseInt(round.getFirstHit()) + Integer.parseInt(round.getSecondHit());
    }
}
