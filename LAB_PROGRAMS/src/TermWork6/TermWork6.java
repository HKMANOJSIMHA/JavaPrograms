package TermWork6;

import java.util.Scanner;

public class TermWork6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		MyCalculator e1=new MyCalculator();
		System.out.println("ENTER AN INTEGER:");
		int n=sc.nextInt();
		int sum=e1.divisorSum(n);
		if(sum==-1) 
			System.out.println("INVALID INPUT");
		else
			System.out.println("DIVISOR SUM IS:"+sum);
		
	}

}
