import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char playAgain;
        
        int roundsWon = 0;
        int totalScore = 0;

        do {
            Random ra = new Random();
            int number = ra.nextInt(100) + 1;

            int guess;
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessed = false;
           

            System.out.println("\n🎯 Guess the number between 1 to 100");
            System.out.println("You have only 5 attempts!");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("🎉 Congratulations! You guessed the right number!");
                    guessed = true;
                 
                    
                int roundScore = (maxAttempts-attempts);
                
                totalScore += roundScore ;
                
                System.out.println("You earned: " +roundScore +"points");
                roundsWon ++;
                break;
                
                } 
                else if (guess > number) {
                    System.out.println("📉 Too high! Try a smaller number.");
                } 
                else {
                    System.out.println("📈 Too low! Try a bigger number.");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!guessed) {
                System.out.println("\n❌ Game Over! You used all attempts.");
                System.out.println("✅ The correct number was: " + number);
            }

            System.out.print("\nDo you want to play again? (y/n): ");
            playAgain = sc.next().charAt(0);

        } while (playAgain == 'y' || playAgain == 'Y');
        System.out.println("\n Final Score:");
        System.out.println("Totale Score"+totalScore);
        System.out.println("Total Round won"+roundsWon);
        System.out.println("\n🙏 Thanks for playing!");
        sc.close();
    }
}