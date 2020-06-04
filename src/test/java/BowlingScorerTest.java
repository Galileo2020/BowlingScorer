import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BowlingScorerTest {

    @Test
    void shouldReturnZeroWhenCalculateTotalScoresGivenEveryRoundHaveNotHitTheBall () {
        // Given
        Round round0 = new Round("0", "0");
        Round round1 = new Round("0", "0");
        Round round2 = new Round("0", "0");
        Round round3 = new Round("0", "0");
        Round round4 = new Round("0", "0");
        Round round5 = new Round("0", "0");
        Round round6 = new Round("0", "0");
        Round round7 = new Round("0", "0");
        Round round8 = new Round("0", "0");
        Round round9 = new Round("0", "0");
        BowlingScorer bowlingScorer = new BowlingScorer(Arrays.asList(round0, round1, round2, round3, round4, round5, round6, round7, round8, round9));
        // When
        int totalScores = bowlingScorer.calculateTotalScores();
        // Then
        Assertions.assertEquals(0, totalScores);
    }
}
