import java.util.List;

public class BowlingScorer {

    private List<Round> rounds;

    public BowlingScorer(List<Round> rounds) {
        this.rounds = rounds;
    }

    public int calculateTotalScores() {
        int totalScores = 0;
        for (int i = 0; i < rounds.size(); i++) {
            Round round = rounds.get(i);
            totalScores += "/".equals(round.getSecondHit()) ? 10 + Integer.parseInt(rounds.get(i + 1).getFirstHit()) : Integer.parseInt(round.getFirstHit()) + Integer.parseInt(round.getSecondHit());
        }
        return totalScores;
    }
}
