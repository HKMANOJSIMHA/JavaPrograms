package PracticeProgram4;

import java.util.Scanner;

public class PracticeProgram4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE AGE OF THE CITIZEN:");
		int age=sc.nextInt();
		System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
		double amount=sc.nextDouble();
		System.out.println("ENTER THE TIME:");
		double t=sc.nextDouble();		
		computeSI SI_obj=new computeSI(age,amount,t);
		SI_obj.DisplayCitizenDetails();
		System.out.println("SIMPLE INTREST IS:"+SI_obj.computeIntrest());
	}

}
