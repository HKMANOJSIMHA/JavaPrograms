package practiceProgram2;

import java.util.Scanner;

public class PracticeProgram2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE PRINCIPAL AMOUNT:");
		double p=sc.nextDouble();
		System.out.println("ENTER THE TIME:");
		double t=sc.nextDouble();
		System.out.println("ENTER THE RATE OF INTREST:");
		double r=sc.nextDouble();
		
		computeIntrest SI=new computeIntrest(p,t,r);
		SI.compute();
		SI.displayResult();

	}

}
