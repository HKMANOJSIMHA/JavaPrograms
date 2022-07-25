import java.util.Scanner;
abstract class Calculator{
	abstract int compute(int a,int b);
}
class Add extends Calculator{
	int compute(int a,int b) {
		return a+b;
	}
}
class Sub extends Calculator{
	int compute(int a,int b) {
		return a-b;
	}
}
class mul extends Calculator{
	int compute(int a,int b) {
		return a*b;
	}
}
class div extends Calculator{
	int compute(int a,int b) {
		return a/b;
	}
}
public class simpleCalc {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Add a=new Add();
		Sub s=new Sub();
		mul m=new mul();
		div d=new div();
		for(;;) {
			System.out.printf("ENTER YOUR CHOICE:\n1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT\n");
			int choice=sc.nextInt();
			switch(choice) {
			case 1: System.out.println("ENTER ANY TWO NUMBERS:");
				    int n1=sc.nextInt();
			        int n2=sc.nextInt();
				    System.out.println("SUM OF TWO NUMBERS IS :"+a.compute(n1,n2));
			        break;
			case 2: System.out.println("ENTER ANY TWO NUMBERS:");
				    n1=sc.nextInt();
			        n2=sc.nextInt();
				   System.out.println("DIFFERENCE OF TWO NUMBERS IS :"+s.compute(n1,n2));
		           break;
			case 3: System.out.println("ENTER ANY TWO NUMBERS:");
				    n1=sc.nextInt();
			        n2=sc.nextInt();
				    System.out.println("PRODUCT OF TWO NUMBERS IS :"+m.compute(n1,n2));
		            break;
			case 4: System.out.println("ENTER ANY TWO NUMBERS:");
				    n1=sc.nextInt();
			        n2=sc.nextInt();
				    System.out.println("DIVISION OF TWO NUMBERS IS :"+d.compute(n1,n2));
		            break;
			case 5:System.out.println("THANK YOU!!");
			       System.exit(0);
			default:System.out.println("INVALID CHOICE");
			}
		}

	}

}
