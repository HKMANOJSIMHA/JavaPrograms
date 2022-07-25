package Unit3;

import java.util.Scanner;

interface AdvancedArithematic{
	abstract int divisor_sum(int num);
}

class divisorSum1 implements AdvancedArithematic{
	public int divisor_sum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0)
				sum=sum+i;
		}
		return sum;
	}
}

class divisorSum2 implements AdvancedArithematic{
	public int divisor_sum(int num) {
		int sum=0;
		for(int i=1;i<=num;i+=2) {
			if(num%i==0)
				sum=sum+i;
		}
		return sum;
	}
}

public class unit3e {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		divisorSum1 d1=new divisorSum1();
		divisorSum2 d2=new divisorSum2();
		
		System.out.println("Enter an integer:");
		int num=sc.nextInt();
		
		System.out.println("Divisor sum of number "+num+" is:"+d1.divisor_sum(num));
		System.out.println("Odd divisor sum of number "+num+" is:"+d2.divisor_sum(num));
	}

}
