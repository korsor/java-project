package exam1;

public class Exam01 {
    private String player1;
    private String player2;
    private int scorePlayer1 = 0;
    private int scorePlayer2 = 0;

    public Exam01(String firstPerson, String secondPerson) {
        this.player1 = firstPerson;
        this.player2 = secondPerson;
    }

    public void playerAWin() {
        if (!(scorePlayer1 >= 5 || scorePlayer2 >= 5)) {
            if (scorePlayer1 == 4 && scorePlayer2 == 4) {
                scorePlayer1 = 4;
                scorePlayer2 = 3;
            } else if (scorePlayer1 == 3 && scorePlayer1 > scorePlayer2)
                scorePlayer1 += 2;
            else scorePlayer1++;
        }
    }

    public void playerBWin() {
        if (!(scorePlayer1 >= 5 || scorePlayer2 >= 5)) {
            if (scorePlayer1 == 4 && scorePlayer2 == 4) {
                scorePlayer1 = 3;
                scorePlayer2 = 4;
            } else if (scorePlayer2 == 3 && scorePlayer2 > scorePlayer1)
                scorePlayer2 += 2;
            else scorePlayer2++;
        }
    }

    public String getScore() {
        if (scorePlayer1 == scorePlayer2) {
            if (scorePlayer1 == 3 || scorePlayer1 == 4)
                return "Deuce";
            return convertScoreToString(scorePlayer1) + "-All";
        }
        if (scorePlayer1 == 4)
            return "Advantage " + player1;
        if (scorePlayer2 == 4)
            return "Advantage " + player2;
        if (scorePlayer1 == 5)
            return "Win for " + player1;
        if (scorePlayer2 == 5)
            return "Win for " + player2;
        return convertScoreToString(scorePlayer1) + "-" + convertScoreToString(scorePlayer2);
    }

    private String convertScoreToString(int score) {
        if (score == 0)
            return "Love";
        if (score == 1)
            return "Fifteen";
        if (score == 2)
            return "Thirty";
        if (score == 3)
            return "Forty";
        return "";
    }
}
