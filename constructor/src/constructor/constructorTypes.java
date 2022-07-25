package constructor;
import java.util.Scanner;
class complexOperations{
	double real;
	double imaginary;
	complexOperations(){
		real=imaginary=0;
	}
	complexOperations(double r,double i){
		real=r;
		imaginary=i;
	}
	complexOperations complexAddition(complexOperations c1,complexOperations c2) {
		complexOperations c3=new complexOperations();
		c3.real=c1.real+c2.real;
		c3.imaginary=c1.imaginary+c2.imaginary;
		return c3;
		}
}
public class constructorTypes {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			System.out.println("ENTER THE REAL PART VALUE OF 1st NUMBER:");
			double real=sc.nextDouble();
			System.out.println("ENTER THE IMAGINARY PART VALUE VALUE OF 1st NUMBER:");
			double imaginary=sc.nextDouble();
			complexOperations c1=new complexOperations(real,imaginary);
			System.out.println("ENTER THE REAL PART VALUE OF 2nd NUMBER:");
			real=sc.nextDouble();
			System.out.println("ENTER THE IMAGINARY PART VALUE VALUE OF 2nd10 NUMBER:");
			imaginary=sc.nextDouble();
			complexOperations c2= new complexOperations(real,imaginary);
			complexOperations temp=new complexOperations();
			temp=temp.complexAddition(c1,c2);
			System.out.println("SUM OF COMPLEX ADDITION IS :"+temp.real+" "+"+"+" "+"i("+temp.imaginary+")");
		}

	}


