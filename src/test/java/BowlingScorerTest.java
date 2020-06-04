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

    @Test
    void shouldReturnTheTotalAmountOfEveryRoundsWhenCalculateTotalScoresGivenEveryRoundHaveNotHitAllTheBalls () {
        // Given
        Round round0 = new Round("0", "0");
        Round round1 = new Round("0", "1");
        Round round2 = new Round("1", "1");
        Round round3 = new Round("1", "2");
        Round round4 = new Round("1", "3");
        Round round5 = new Round("1", "4");
        Round round6 = new Round("1", "5");
        Round round7 = new Round("1", "6");
        Round round8 = new Round("1", "7");
        Round round9 = new Round("1", "8");
        BowlingScorer bowlingScorer = new BowlingScorer(Arrays.asList(round0, round1, round2, round3, round4, round5, round6, round7, round8, round9));
        // When
        int totalScores = bowlingScorer.calculateTotalScores();
        // Then
        Assertions.assertEquals(0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9, totalScores);
    }

    @Test
    void shouldReturnTheTotalAmountOfEveryRoundsAndFirstHitAfterSpareWhenCalculateTotalScoresGivenTheNinthRoundHitSpareAndEveryOtherRoundHaveNotHitAllTheBalls () {
        // Given
        Round round0 = new Round("0", "0");
        Round round1 = new Round("0", "1");
        Round round2 = new Round("1", "1");
        Round round3 = new Round("1", "2");
        Round round4 = new Round("1", "3");
        Round round5 = new Round("1", "4");
        Round round6 = new Round("1", "5");
        Round round7 = new Round("1", "6");
        Round round8 = new Round("1", "/");
        Round round9 = new Round("1", "8");
        BowlingScorer bowlingScorer = new BowlingScorer(Arrays.asList(round0, round1, round2, round3, round4, round5, round6, round7, round8, round9));
        // When
        int totalScores = bowlingScorer.calculateTotalScores();
        // Then
        Assertions.assertEquals(0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 10 + 9 + 1, totalScores);
    }

    @Test
    void shouldReturnTheTotalAmountOfEveryRoundsWhenCalculateTotalScoresGivenTheLastRoundHitSpareAndEveryOtherRoundHaveNotHitAllTheBalls () {
        // Given
        Round round0 = new Round("0", "0");
        Round round1 = new Round("0", "1");
        Round round2 = new Round("1", "1");
        Round round3 = new Round("1", "2");
        Round round4 = new Round("1", "3");
        Round round5 = new Round("1", "4");
        Round round6 = new Round("1", "5");
        Round round7 = new Round("1", "6");
        Round round8 = new Round("1", "7");
        Round round9 = new Round("1", "/");
        BowlingScorer bowlingScorer = new BowlingScorer(Arrays.asList(round0, round1, round2, round3, round4, round5, round6, round7, round8, round9));
        // When
        int totalScores = bowlingScorer.calculateTotalScores();
        // Then
        Assertions.assertEquals(0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 10, totalScores);
    }
}
