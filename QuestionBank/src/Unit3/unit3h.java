package Unit3;

import java.util.Scanner;

interface bestSum{
	abstract void computeBestSum(int n1,int n2,int n3);
}

class compute implements bestSum{
	public void computeBestSum(int n1,int n2, int n3) {
		int sum1=n1+n2;
		int sum2=n2+n3;
		int sum3=n1+n3;
		
		if(sum1>=sum2&&sum1>=sum3) {
			System.out.println("Best of 2 IA is:"+sum1);
			return;
		}
		if(sum2>=sum1&&sum2>=sum3) {
			System.out.println("Best of 2 IA is:"+sum2);
			return;
		}
		if(sum3>=sum1&&sum3>=sum2) {
			System.out.println("Best of 2 IA is:"+sum3);
			return;
		}
	}
}

public class unit3h {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks scored in 1st IA:");
		int m1=sc.nextInt();
		System.out.println("Enter the marks scored in 2nd IA:");
		int m2=sc.nextInt();
		System.out.println("Enter the marks scored in 3rd IA:");
		int m3=sc.nextInt();
		
		bestSum bObj=new compute();
		
		bObj.computeBestSum(m1, m2, m3);

	}

}
