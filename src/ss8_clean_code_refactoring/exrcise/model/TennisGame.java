package ss8_clean_code_refactoring.exrcise.model;

public class TennisGame {

    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int TOW = 2;
    public static final int THREE = 3;


    public String getScore(int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        boolean isDeuce = firstPlayerScore == secondPlayerScore;
        boolean isScoreMoreThan4 = firstPlayerScore >= 4 || secondPlayerScore >= 4;
        if (isDeuce) return result(firstPlayerScore);
        if (isScoreMoreThan4) {
            return win(firstPlayerScore, secondPlayerScore);
        }
        return currentScore(firstPlayerScore, secondPlayerScore, score);
    }

    public String result(int firstPlayerScore) {
        switch (firstPlayerScore) {
            case ZERO:
                return "Love-All";

            case ONE:
                return "Fifteen-All";

            case TOW:
                return "Thirty-All";

            case THREE:
                return "Forty-All";

            default:
                return "Deuce";
        }
    }

    public static String win(int firstPlayerSorce, int secondPlayerScore) {
        int minusResult = firstPlayerSorce - secondPlayerScore;
        if (minusResult == 1)
            return "Advantage player1";
        else if (minusResult == -1)
            return "Advantage player2";
        else if (minusResult >= 2)
            return "Win for player1";
        else
            return "Win for player2";
    }

    public static String currentScore(int firstPlayerScore, int secondPlayerScore, String score) {
        int tempScore = 0;
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i < 3; i++) {
            if (i == 1) {
                tempScore = firstPlayerScore;
            } else {
                scoreBuilder.append("-");
                tempScore = secondPlayerScore;
            }
            switch (tempScore) {
                case ZERO:

                    score += "Love";
                    break;
                case ONE:
                    score += "Fifteen";
                    break;
                case TOW:
                    score += "Thirty";
                    break;
                case THREE:
                    score += "Forty";
                    break;
            }
        }


        return score;
    }
}