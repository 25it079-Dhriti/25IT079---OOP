import java.util.Random;
import java.util.Scanner;
public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] moves = { "ROCK", "PAPER", "SCISSORS", "LIZARD", "SPOCK" };
        int playerScore = 0;
        int computerScore = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nRound " + i);
            System.out.println("1. ROCK");
            System.out.println("2. PAPER");
            System.out.println("3. SCISSORS");
            System.out.println("4. LIZARD");
            System.out.println("5. SPOCK");
            System.out.print("Enter your choice: ");
            int player = sc.nextInt();
            if (player < 1 || player > 5) {
                System.out.println("Invalid Choice! Please enter a number between 1 and 5.");
                i--;
                continue;
            }
            int computer = random.nextInt(5) + 1;
            System.out.println("Player Move   : " + moves[player - 1]);
            System.out.println("Computer Move : " + moves[computer - 1]);
            if (player == computer) {
                System.out.println("It's a Tie!");
            } else if ((player == 1 && (computer == 3 || computer == 4)) ||
                    (player == 2 && (computer == 1 || computer == 5)) ||
                    (player == 3 && (computer == 2 || computer == 4)) ||
                    (player == 4 && (computer == 2 || computer == 5)) ||
                    (player == 5 && (computer == 1 || computer == 3))) {
                System.out.println("You Win this Round!");
                playerScore++;
            } else {
                System.out.println("Computer Wins this Round!");
                computerScore++;
            }
        }
        System.out.println("\n===== Final Result =====");
        System.out.println("Player Score   : " + playerScore);
        System.out.println("Computer Score : " + computerScore);
        if (playerScore > computerScore) {
            System.out.println("You win " + playerScore + "-" + computerScore);
        } else if (computerScore > playerScore) {
            System.out.println("Computer wins " + computerScore + "-" + playerScore);
        } else {
            System.out.println("The game is a tie!");
        }
        sc.close();
    }
}