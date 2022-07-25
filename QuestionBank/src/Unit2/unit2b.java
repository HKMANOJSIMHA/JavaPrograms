package Unit2;
import java.util.Scanner;

class computePrimeSum{
	int flag=0,sum=0;
	int computePrime(int n) {
		for(int i=2;i<=n;i++) {
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=1;
				}
			}
			if(flag==0)
				sum=sum+i;
			flag=0;
		}
		return sum;
	}
}

public class unit2b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the upper limit");
		int n= sc.nextInt();
		
		computePrimeSum psObj=new computePrimeSum();
		int sum=psObj.computePrime(n);
		if(sum>0)
			System.out.println("The sum of prime numbers between 1-"+n+" is:"+sum);
		else
			System.out.println("No prime numbers in this range");
			
	}

}
