import java.util.Scanner;
class overload{
	double l;
	double b;
	void init() {
		l=b=0;
	}
	//overloaded method
	void init(double l,double b) {
		this.l=l;
		this.b=b;
	}
	//overloaded method
	void init(double side) {
		l=b=side;
	}
	double area() {
		return l*b;
	}
}
public class overloading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		overload obj=new overload();
		for(;;) {
			System.out.println("ENTER YOUR CHOICE:");
			System.out.println("s/S->Area of Square");
			System.out.println("r/R->Area of Rectangle");
			System.out.println("e/E->To Exit");
			char choice=sc.next().charAt(0);
			switch(choice) {
			
			case 's':
			case 'S':System.out.println("ENTER THE LENGTH OF SIDE OF SQUARE:");
			         double side=sc.nextDouble();
			         obj.init(side);
			         System.out.println("AREA OF SQUARE IS:"+obj.area());
			         break;
			case 'r':
			case 'R':System.out.println("ENTER THE LENGTH AND BREADTH OF RECTANGLE:");
			         double length=sc.nextDouble();
			         double breadth=sc.nextDouble();
			         obj.init(length,breadth);
			         System.out.println("AREA OF RECTANGLE IS:"+obj.area());
			         break;
			case 'e':
			case 'E':System.out.println("THANK YOU!!");
			         System.exit(0);
			default:System.out.println("INVALID CHOICE");
			}
		}

	}

}
