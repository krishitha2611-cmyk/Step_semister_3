package string.class_problems;

import java.util.Random;

public class RockPaperScissors {

    static String playRound(String playerMove, String computerMove) {

        if (playerMove.equals(computerMove))
            return "Draw";

        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper")))
            return "Player Wins";

        return "Computer Wins";
    }

    public static void main(String[] args) {

        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};

        Random random = new Random();

        int wins = 0, losses = 0, draws = 0;

        System.out.println("Round\tPlayer\tComputer\tResult");

        for (int i = 0; i < 5; i++) {

            String computerMove = moves[random.nextInt(3)];
            String result = playRound(playerMoves[i], computerMove);

            System.out.println((i + 1) + "\t" + playerMoves[i] + "\t" + computerMove + "\t\t" + result);

            if (result.equals("Player Wins"))
                wins++;
            else if (result.equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        double winPercentage = (wins * 100.0) / 5;

        System.out.println("\nFinal Summary");
        System.out.println("Wins : " + wins);
        System.out.println("Losses : " + losses);
        System.out.println("Draws : " + draws);
        System.out.printf("Win Percentage : %.2f%%", winPercentage);
    }
}