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
        if(!(isWinner()))
            scorePlayer1++;
    }

    public void playerBWin() {
        if(!(isWinner()))
            scorePlayer2++;
    }

    public String getScore() {
        if (isWinner())
            return "Win for " + ((scorePlayer1 > scorePlayer2) ? player1 : player2);
        else if (isAdvantage())
            return "Advantage " + ((scorePlayer1 > scorePlayer2) ? player1 : player2);
        else if (isDeuce())
            return "Deuce";
        else if (isAll())
            return convertScoreToString(scorePlayer1) + "-All";
        else
            return convertScoreToString(scorePlayer1) + "-" + convertScoreToString(scorePlayer2);
    }

    private String convertScoreToString(int score) {
        String[] ScoreToString = {"Love", "Fifteen", "Thirty", "Forty"};
        return ScoreToString[score];
    }

    private boolean isWinner() {
        if ((scorePlayer1 >= 4 || scorePlayer2 >= 4) && Math.abs(scorePlayer1 - scorePlayer2) >= 2)
            return true;
        return false;
    }

    private boolean isAdvantage() {
        if ((scorePlayer1 >= 4 || scorePlayer2 >= 4) && Math.abs(scorePlayer1 - scorePlayer2) == 1)
            return true;
        return false;
    }

    private boolean isDeuce() {
        if ((scorePlayer1 >= 3 || scorePlayer2 >= 3) && scorePlayer1 == scorePlayer2)
            return true;
        return false;
    }

    private boolean isAll() {
        if (!(scorePlayer1 >= 3 || scorePlayer2 >= 3) && scorePlayer1 == scorePlayer2)
            return true;
        return false;
    }
}
