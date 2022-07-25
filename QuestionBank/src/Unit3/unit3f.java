package Unit3;

import java.util.Scanner;

class useStatic{
	static String name;
	static String USN;
	static String branch;
	static int sem;
	static double fees;
	
	static void displayDetails() {
		System.out.println();
		System.out.println("Details of student are:");
		System.out.println("Name:"+name);
		System.out.println("USN:"+USN);
		System.out.println("Branch:"+branch);
		System.out.println("Semester:"+sem);
		System.out.println("Fees paid:"+fees);
	}
}

public class unit3f {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student details:");
		System.out.print("Name:");
	    useStatic.name=sc.next();
		System.out.print("USN:");
		useStatic.USN=sc.next();
		System.out.print("Branch:");
		useStatic.branch=sc.next();
		System.out.print("Semester:");
		useStatic.sem=sc.nextInt();
		System.out.print("Fees paid:");
		useStatic.fees=sc.nextDouble();
		
		useStatic.displayDetails();
	}

}
