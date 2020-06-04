import java.util.List;

public class BowlingScorer {

    private List<Round> rounds;

    public BowlingScorer(List<Round> rounds) {
        this.rounds = rounds;
    }

    public int calculateTotalScores() {
        return rounds.stream()
                .map(round -> Integer.parseInt(round.getFirstHit()) + Integer.parseInt(round.getSecondHit()))
                .reduce(Integer::sum)
                .orElse(0);
    }
}
