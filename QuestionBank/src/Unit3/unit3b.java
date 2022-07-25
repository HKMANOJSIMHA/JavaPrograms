package Unit3;

import java.util.Scanner;

class polygon{
	
	double area(double l) {
		return l*l;
	}
	
	double area(double l,double b) {
		return l*b;
	}
}

public class unit3b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		polygon pObj=new polygon();
		System.out.println("Enter the length of the side of the square:");
		double l=sc.nextDouble();
		System.out.println("Area of square is:"+pObj.area(l));
		
		System.out.println("Enter the length of the rectangle:");
		l=sc.nextDouble();
		System.out.println("Enter the breadth of the rectangle:");
		double b=sc.nextDouble();
		System.out.println("Area of rectangle is:"+pObj.area(l, b));
	}

}

//OOP concept used is method overloading