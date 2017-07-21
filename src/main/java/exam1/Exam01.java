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
        if(scorePlayer2 <=15)
            scorePlayer2 += 15;
        else scorePlayer2+=10;
    }

    public String getScore() {
        if(scorePlayer1 == 0){
            if(scorePlayer2 == 15)
                return "Love-Fifteen";
            if(scorePlayer2 == 30)
                return "Love-Thirty";
            if(scorePlayer2 == 40)
                return "Love-Forty";
            if(scorePlayer2 == 50)
                return "Win for Player B";
        }

        if(scorePlayer1 == 15) {
            if(scorePlayer2 == 15)
                return "Fifteen-All";
            return "Fifteen-Love";
        }
        if(scorePlayer1 == 30) {
            if(scorePlayer2==0)
                return "Thirty-Love";
            if(scorePlayer2 == 30)
                return "Thirty-All";
        }

        if(scorePlayer1 == 40)
            return "Forty-Love";
        if(scorePlayer1 == 50)
            return "Win for Player A";

        return "Love-All";
    }

}
