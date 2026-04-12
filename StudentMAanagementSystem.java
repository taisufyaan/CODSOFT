import java.util.ArrayList;
import java.util.Scanner;

public class StudentMAanagementSystem {
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Studentt> students = new ArrayList<>();
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice ;

		do {
			System.out.println("\n1.Add Student");
			System.out.println("2.view Student");
			System.out.println("3.Search Student");
		    System.out.println("4.remove Student ");
			System.out.println("5.updte Student");
			System.out.println("6.EXit");
			
			System.out.println("\n Enter Your Choice :");
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1: addStudent();break;
			case 2: viewStudent();break;
			case 3: searchStudent();break;
			case 4: removeStudent();break;
			case 5: updateStudent();break;
				
			
						
			}
			}while(choice != 6);
			
		}
	




	private static void addStudent() {
		// TODO Auto-generated method stub
	 
            
		    sc.nextLine(); // 🔥 clear buffer
            
		    System.out.print("Enter Student Name: ");
		    String name = sc.nextLine();
            
		    if(name.isEmpty()) {
		        System.out.println("Name cannot be empty");
		        return;
		    }

		    int rollno;
		    System.out.print("Enter Roll No: ");
		    try {
		        rollno = sc.nextInt();
		    } catch(Exception e) {
		        System.out.println("Error : Enter number only!");
		        sc.nextLine();
		        return;
		    }

		    if(rollno <= 0) {
		        System.out.println("Roll no must be > 0");
		        return;
		    }

		    for(Studentt s : students) {
		        if(s.rollno == rollno) {
		            System.out.println("Roll no already exists!");
		            return;
		        }
		    }

		    int age;
		    System.out.print("Enter Age: ");
		    try {
		        age = sc.nextInt();
		    } catch(Exception e) {
		        System.out.println("Enter valid age!");
		        sc.nextLine();
		        return;
		    }

		    sc.nextLine(); // clear buffer

		    System.out.print("Enter Course: ");
		    String course = sc.nextLine();

		    students.add(new Studentt(name, rollno, age, course));
		    System.out.println("Student Added!");
		}
	  
	  
		
	




	private static void viewStudent() {
		// TODO Auto-generated method stub
		
		
		   if (students.isEmpty()) {
		        System.out.println("No students found!");
		        return;
		    }
		   else {
		for(int i=0;i< students.size(); i++) {
			Studentt s = students.get(i);
			
			System.out.println("rollno: "+s.rollno);
			System.out.println("Name: "+s.name);
			System.out.println("Age: "+s.age);
			System.out.println("Course: "+s.course);
			
		}
			
		}
		
		
		
	}




	private static void  removeStudent() {
		// TODO Auto-generated method stub
		System.out.println("Enter deletid :");
		int d_rollno = sc.nextInt();
		for(int i=0; i < students.size(); i++)
		if(students.get(i).rollno == d_rollno) {
			students.remove(i);
			System.out.println("Student Deleted!");
			
			
		}
		
		
		
	}
	
	
	private static void searchStudent()  {
		
		System.out.println("Enter Rollno :");
		int s_rollno = sc.nextInt();
		for(Studentt s:students) {
			if(s.rollno==s_rollno) {
		    System.out.println("Found......");
		    try {
		    Thread.sleep(3000);
		    }
		    catch(InterruptedException e) {
		    	 e.printStackTrace();
		    }
			System.out.println("Name"+s.name);
			System.out.println("Age"+s.age);
			System.out.println("Course"+s.course);
			return;
		}
		
		
	}
	System.out.println("Student not found!");

	}


	private static void updateStudent() {
		// TODO Auto-generated method stub
		System.out.print("Enter Roll No to update: ");
		int u_rollno = sc.nextInt();
		sc.nextLine();

		boolean found = false;

		for(int i = 0; i < students.size(); i++) {

		    Studentt s = students.get(i);

		    if(s.rollno == u_rollno) {

		        found = true;

		        System.out.print("Enter new name: ");
		        String name = sc.nextLine();

		        if(name.isEmpty()) {
		            System.out.println("Name cannot be empty!");
		            return;
		        }

		        System.out.print("Enter new age: ");
		        int age;
		        try {
		            age = sc.nextInt();
		        } catch(Exception e) {
		            System.out.println("Invalid age!");
		            sc.nextLine();
		            return;
		        }
		        sc.nextLine();

		        System.out.print("Enter new course: ");
		        String course = sc.nextLine();

		        // update values
		        s.name = name;
		        s.age = age;
		        s.course = course;

		        System.out.println("Student Updated Successfully!");
		        return;
		    }
		}

		if(!found) {
		    System.out.println("Student not found!");
		
				 
				 
			 }
		 }
		
		
	}
		
		
		
		

		
	


