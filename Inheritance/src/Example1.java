/*THERE IS A CLASS BY NAME "ARITHMATIC" WHICH HAS A MEMBER FUNCTION "ADD" WHICH TAKES IN TWO PATAMETERS
 (int,int) AND RETURNS THE SUM OF BOTH OF THAT.THERE IS ANOTHER CLASS BY NAME ADDER THAT HAS A DISPLAY 
 FUNCTION JUST TO PRINT WELCOME MESSAGE.IMPLEMENT ADDITION OPERATION FROM MAIN CLASS BY PASSING 
 VALUE FROM MAIN CLASS ADDERINHERITANCE USE INHERITANCE FOR IMPLEMENTING THIS 
*/
import java.util.Scanner;
class Arithmatic{
	int Add(int n1,int n2) {
		return n1+n2;
	}
}
class Adder extends Arithmatic{
	void display() {
		System.out.println("WELCOME");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Adder add=new Adder();
		add.display();
		System.out.println("ENTER THE VALUE OF TWO NUMBERS:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println("SUM OF TWO NUMBERS IS:"+add.Add(num1, num2));
		
		//CODE SEGMENT TO PRINT NAME OF PARENT CLASS
		System.out.println(add.getClass().getSuperclass().getName());
		
	}

}
