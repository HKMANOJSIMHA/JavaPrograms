package Unit1;
import java.util.Scanner;
abstract class computeArea{
	abstract void Area();
}
class Square extends computeArea{
	double length;
	Square(double l){
		length=l;
	}
	void Area() {
		System.out.println("Area of square is:"+(length*length));
	}
}
class Rectangle extends computeArea{
	double length,breadth;
	Rectangle(double l,double b){
		length=l;
		breadth=b;
	}
	void Area() {
		System.out.println("Area of rectangle is:"+(length*breadth));
	}
}
class Triangle extends computeArea{
	double base,height;
	Triangle(double b,double h){
		base=b;
		height=h;
	}
	void Area() {
		System.out.println("Area of triangle is:"+(0.5*base*height));
	}
}

public class unit1a {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the square:");
		double l=sc.nextDouble();
		Square sqObj=new Square(l);
		sqObj.Area();
		System.out.println("Enter the length of the rectangle:");
		l=sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle:");
		double b=sc.nextDouble();
		Rectangle rObj=new Rectangle(l,b);
		rObj.Area();
		System.out.println("Enter the base of triangle:");
		double base=sc.nextDouble();
		System.out.println("Enter the height of triangle:");
		double height=sc.nextDouble();
		Triangle tObj=new Triangle(base,height);
		tObj.Area();
	}

}
