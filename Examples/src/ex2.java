/*write a java program that takes an input from the user and if the number is greater than 50 than print number beyond limit 
 * else print number*/
import java.util.Scanner;
class numberLimit extends Exception{
	int number;
	
	public numberLimit(int number) {
		this.number = number;
	}

	public String toString(){
		return number+" is out of limit";
	}
}
class checkNumber{
	checkNumber(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		try {
			if(n>50) {
				throw new numberLimit(n);
			}
		}catch(numberLimit nl) {
			System.out.println(nl.toString());
			return;
		}
		System.out.println("The number is"+n);
	}
}
public class ex2 {

	public static void main(String[] args) {
		checkNumber cn=new checkNumber();

	}

}
