import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        int computerChoice = random.nextInt(3);

        System.out.println("Let's play Rock-Paper-Scissors! Enter your choice (rock, paper, or scissors):");
        String userChoice = scanner.nextLine();
        System.out.println("You chose " + userChoice + ".");
        System.out.println("The computer chose " + choices[computerChoice] + ".");

        if (userChoice.equals(choices[computerChoice])) {
            System.out.println("It's a tie!");
        } else if (userChoice.equals("rock") && choices[computerChoice].equals("scissors") ||
                userChoice.equals("paper") && choices[computerChoice].equals("rock") ||
                userChoice.equals("scissors") && choices[computerChoice].equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("The computer wins!");
        }
    }
}

