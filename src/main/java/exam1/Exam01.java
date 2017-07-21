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
        scorePlayer1 += 15;
    }

    public void playerBWin() {
    }

    public String getScore() {

        if(scorePlayer1 == 15)
            return "Fifteen-Love";
        return "Love-All";
    }

}
