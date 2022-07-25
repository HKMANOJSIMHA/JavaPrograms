import java.util.Scanner;
interface AdvanceArithmetic{
		int divisorSum(int n);
}
class MyCalculator implements  AdvanceArithmetic{
	public int divisorSum(int n) {
		if(n>1000)
			return -1;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				sum+=i;
		}
		return sum;
	}
}
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