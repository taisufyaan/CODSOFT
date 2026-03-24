import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ra=new Random();
		int n=ra.nextInt(100)+1;
	    
	    Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter your guess number");
		int guess = sc.nextInt();
		if (guess ==n)
		{
			System.out.println("correct! You guessed the right number");
		}else if(guess > n) {
			System.out.println("Too high! Try a smaller number");
			
		}else {
			System.out.println("Too low ! Try a bigger number");
		}
	
	
		System.out.print("\n ypur genrated number is "+n);
		
		sc.close();

	}

}
