package exam1;

public class Exam01 {
    String player1 = "";
    String player2 = "";
    int scorePlayer1 = 0;
    int scorePlayer2 = 0;

    public Exam01(String firstPerson, String secondPerson) {

        this.player1 = firstPerson;
        this.player2 = secondPerson;

    }

    public void playerAWin() {
        if(scorePlayer1 <=15)
            scorePlayer1 += 15;
        else scorePlayer1+=10;
    }

    public void playerBWin() {
    }

    public String getScore() {

        if(scorePlayer1 == 15)
            return "Fifteen-Love";
        if(scorePlayer1 == 30)
            return "Thirty-Love";
        if(scorePlayer1 == 40)
            return "Forty-Love";
        return "Love-All";
    }

}
