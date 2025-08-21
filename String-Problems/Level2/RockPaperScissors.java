import java.util.*;

public class RockPaperScissors {
    static String[] choices = {"rock", "paper", "scissors"};

    public static String computerChoice() {
        int rand = (int)(Math.random() * 3);
        return choices[rand];
    }

    public static int findWinner(String user, String comp) {
        if (user.equals(comp)) return 0; // tie
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) {
            return 1; // user wins
        } else {
            return -1; // computer wins
        }
    }

    public static void displayStats(int userWins, int compWins, int totalGames) {
        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        System.out.println("\nResults:");
        System.out.println("User Wins: " + userWins + " (" + userPercent + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + compPercent + "%)");
        System.out.println("Ties: " + (totalGames - userWins - compWins));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Game " + i + " - Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = computerChoice();
            System.out.println("Computer chose: " + comp);

            int result = findWinner(user, comp);
            if (result == 1) {
                System.out.println("You win!");
                userWins++;
            } else if (result == -1) {
                System.out.println("Computer wins!");
                compWins++;
            } else {
                System.out.println("It's a tie!");
            }
        }

        displayStats(userWins, compWins, n);
    }
}

