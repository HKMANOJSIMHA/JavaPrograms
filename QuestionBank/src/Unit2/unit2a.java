package Unit2;

import java .util.Scanner;

class sum{
	int sum=0;
	int computeSum(int n) {
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}
}

class average{
	double sum=0;
	double computeAverage(int n) {
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		return sum/n;
	}
}

public class unit2a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(args[0]);
		
		average avgObj=new average();
		sum sumObj=new sum();
		
		System.out.println("Sum of "+n+" numbers are:"+sumObj.computeSum(n));
		System.out.println("Average of "+n+" numbers are:"+avgObj.computeAverage(n));
	}

}
