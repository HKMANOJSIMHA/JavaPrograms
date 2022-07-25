package constructor;
import java.util.Scanner;
class area{
	double side;
	double length;
	double breadth;
	area(double side){
		this.side=side;
	}
	area(double l,double b){
		length=l;
		breadth=b;
	}
	double squareArea() {
		return side*side;
	}
	double rectangleArea() {
		return length*breadth;
	}
}

public class constructorOverloading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SHAPE:");
		System.out.println("s/S FOR SQUARE:");
		System.out.println("r/R FOR RECTANGLE:");
		char choice=sc.next().charAt(0);
		switch(choice) {
		case 's':
		case 'S':System.out.println("ENTER THE LENGTH OF SIDE OF SQUARE:");
		         double side=sc.nextDouble();
		         area sq=new area(side);
		         double SqArea=sq.squareArea();
		         System.out.println("AREA OF SQUARE IS:"+" "+SqArea);
		         break;
		case 'r':
		case 'R':System.out.println("ENTER THE LENTH OF RECTANGLE:");
		         double length=sc.nextDouble();
		         System.out.println("ENTER THE BREADTH OF RECTANGLE:");
		         double breadth=sc.nextDouble();
		         area Rec=new area(length,breadth);
		         System.out.println("AREA OF RECTANGLE IS:"+" "+Rec.rectangleArea());
		         break;
		default:System.out.println("INVALID CHOICE");
		}
		

	}

}
