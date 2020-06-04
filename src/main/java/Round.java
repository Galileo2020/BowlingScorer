public class Round {

    private String firstHit;
    private String secondHit;

    public Round(String firstHit, String secondHit) {
        this.firstHit = firstHit;
        this.secondHit = secondHit;
    }

    public Round(String firstHit) {
        this.firstHit = firstHit;
    }

    public String getFirstHit() {
        return firstHit;
    }

    public String getSecondHit() {
        return secondHit;
    }
}
