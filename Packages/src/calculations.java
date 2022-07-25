import advancedArithematic.*;
import basicArithematic.*;
import java.util.Scanner;
public class calculations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		basic b=new basic();
		advanced a=new advanced();
		for(;;) {
			System.out.println("ENTER YOUR CHOICE:");
			System.out.printf("1-ADDITION\n2-SUBTRACTION\n3-MULTIPLICATION\n4-DIVISION\n");
			System.out.printf("5-SINE OF ANGLE\n6-SQUAREROOT OF AN NUMBER\n7-LOG BASE 10 OF AN NUMBER\n");
			System.out.println("8-EXIT");
			int choice=sc.nextInt();
			switch(choice) {
			 		
			case 1:System.out.println("ENTER ANY TWO INTEGERS:");
			       int n1=sc.nextInt();
			       int n2=sc.nextInt();
			       System.out.println("SUM OF TWO NUMBERS IS: "+b.addition(n1,n2));
			       break;
			
			case 2:System.out.println("ENTER ANY TWO INTEGERS:");
		       	   n1=sc.nextInt();
		           n2=sc.nextInt();
		           System.out.println("DIFFERENCE BETWEEN TWO NUMBERS IS: "+b.subtraction(n1,n2));
		           break;
			
			case 3:System.out.println("ENTER ANY TWO INTEGERS:");
		           n1=sc.nextInt();
		           n2=sc.nextInt();
		           System.out.println("PRODUCT OF TWO NUMBERS IS: "+b.multiplication(n1,n2));
		           break;
		           
			case 4:System.out.println("ENTER ANY TWO INTEGERS:");
	               n1=sc.nextInt();
	               n2=sc.nextInt();
	               System.out.println("QUOTIENT OF TWO NUMBERS IS: "+b.division(n1,n2));
	               break;
	               
			case 5:System.out.print("ENTER THE ANGLE:");
				   double n=sc.nextDouble();
				   System.out.println("Sin("+n+") ="+a.sine(n));
				   break;
				   
			case 6:System.out.println("ENTER THE NUMBER:");
			       n=sc.nextDouble();
			       System.out.println("SQUARE ROOT OF "+n+" ="+a.squareRoot(n));
			       break;
			       
			case 7:System.out.println("ENTER A NUMBER");
			       n=sc.nextDouble();
			       System.out.println("LOG BASE 10 VALUE OF "+n+" IS: "+a.logBase10(n));
			       break;
			       
			case 8:System.out.println("THANK YOU!!!");
			       System.exit(0);
			       
			default:System.out.println("INVALID INPUT");
			}
		}
		
	}

}
