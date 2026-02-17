public class Player {

    private String name;
    private int totalScore;

    public Player(String name) {
        this.name = name;
        this.totalScore = 0;
    }

    public void addScore(int score) {
        totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getName() {
        return name;
    }
}
