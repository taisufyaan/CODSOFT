import java.util.Scanner;

public class StudentGradeCalculater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Total number of subject :");
		int subjects = scan.nextInt();
		int totalmarks=0;
        
		for(int i=1; i<=subjects;i++) {
			System.out.println("Enter subject marks"+i);
			int marks = scan.nextInt();
			totalmarks += marks;
			
		}
		 double average=totalmarks/subjects;
		 
         System.out.println("Total marks"+totalmarks);
         System.out.println("Average percentage :" +average+ "%");
         
         char grade;
         
         if(average >= 90) {
            grade='A';
            
         }
         else if(average >= 75) {
        	 grade = 'B';
        	 
         }
         else if(average >= 60) {
        	 grade = 'C';
         }
         else if(average >= 50) {
        	 grade = 'D';
         }
         else {
        	 grade = 'F';
         }
         
         
         System.out.println("\n-----Result-----");
         System.out.println("Total marks"+totalmarks);
         System.out.println("Average percentage :" +average+ "%");
         System.out.println("Grade:"+grade);
         
         
         
      
	}

}
