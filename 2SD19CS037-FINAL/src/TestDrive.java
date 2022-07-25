import java.util.Scanner;
interface basic{
	void Addition();
	void CheckEvenOdd();
	void CheckDivisiblity();
}

interface advanced{
	void tanAngle();
	void ThreePower();
}

abstract class BasicMath implements basic{
	int n1,n2,n3;
	BasicMath(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	BasicMath(int n3) {
		this.n3 = n3;
	}
}

abstract class AdvancedMath implements advanced{
	int n;
	static double angle;
	
	AdvancedMath(int n) {
		this.n = n;
	}
	
	AdvancedMath(double angle) {
		this.angle = angle;
	}
}

class basic1 extends BasicMath{

	basic1(int n1, int n2) {
		super(n1, n2);
	}

	basic1(int n3) {
		super(n3);
	}
	public void Addition() {
		System.out.println("Sum of "+n1+" & "+n2+" is:"+(n1+n2));
	}
	public void CheckEvenOdd() {
		if(n3%2==0) {
			System.out.println(n3+" Is Even");
		}
		else
			System.out.println(n3+" Is Odd");
	}
	public void CheckDivisiblity() {
		if(n3%5==0)
			System.out.println(n3+" Is divisible by 5");
		else
			System.out.println(n3+" Is not divisible by 5");
	}
	
}

class advanced1 extends AdvancedMath{

	advanced1(double angle) {
		super(angle);
	}

	advanced1(int n) {
		super(n);
	}
	public void tanAngle() {
		System.out.println("Tan("+angle+")="+Math.tan(Math.toRadians(angle)));
	}
	public void ThreePower() {
		System.out.println("3^"+n+"="+Math.pow(3, n));
	}
}

public class TestDrive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		for(;;) {
			System.out.println("Enter your choice:");
			System.out.print("1-BasicMathematics\n2-AdvancedMathematics\n");
			final int ch1=sc.nextInt();
			if(ch1==1) {
				for(;;) {
					System.out.println("Enter the operation :");
					System.out.print("1-Addition\n2-CheckEvenOdd\n3-CheckDivisiblity\n4-Exit\n");
					int ch2=sc.nextInt();
					switch(ch2) {
					case 1:System.out.println("Enter two numbers:");
						   int n1=sc.nextInt();
						   int n2=sc.nextInt();
						   basic b1;    //Interface Object
						   basic1 m1=new basic1(n1,n2);
						   b1=m1;
						   b1.Addition();
						   break;
					case 2:System.out.println("Enter the number");
					       int n3=sc.nextInt();
					       basic1 m2=new basic1(n3);
					       b1=m2;
					       b1.CheckEvenOdd();
					       break;
					case 3:System.out.println("Enter the number:");
					       int n4=sc.nextInt();
					       basic1 m3=new basic1(n4);
					       b1=m3;
					       b1.CheckDivisiblity();
					       break;
					case 4:System.exit(0);
					default:System.out.println("Invalid choice");
					}
				}
			}
			else if(ch1==2) {
				for(;;) {
					System.out.println("Enter the operation :");
					System.out.print("1-TanOfngle\n2-PowerOfThree\n3-Exit\n");
					int ch2=sc.nextInt();
					switch(ch2) {
					case 1:System.out.println("Enter the angle:");
						   double angle=sc.nextDouble();
					       advanced h2;   //Interface Object
					       advanced1 m1=new advanced1(angle);
					       h2=m1;
					       h2.tanAngle();
					       break;
					case 2:System.out.println("Enter the n value:");
					       int n=sc.nextInt();
					       advanced m2=new advanced1(n);
					       h2=m2;
					       h2.ThreePower();
					       break;
					case 3:System.exit(0);
					default:System.out.println("Invalid Choice");
					        break;
					}
				}
			}
			else {
				System.out.println("Invalid Choice");
			}
			
		}

	}
	

}
