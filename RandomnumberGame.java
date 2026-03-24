import java.util.Random;
import java.util.Scanner;

public class RandomnumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ra=new Random();
		int n=ra.nextInt(100)+1;
	    
	    Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter your guess number");
		int guess = sc.nextInt();
		System.out.print("\n your guess number is "+guess);
		System.out.print("\n ypur genrated number is "+n);
		
		sc.close();
		
	}

}
