package PracticeProgram1;

import java.util.Scanner;

public class PracticeProgram1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER YOUR NAME:");
		String name=sc.next();
		System.out.println("ENTER YOUR ADHAR NUMBER:");
		long Adharno=sc.nextLong();
		System.out.println("ENTER YOUR QUALIFICATION:");
		String Qualification=sc.next();
		System.out.println("ENTER YOUR STATE:");
		String state=sc.next();
		
		manoj my_obj=new manoj(name,Adharno,Qualification,state);
		my_obj.displayMyDetails();
		

	}

}
