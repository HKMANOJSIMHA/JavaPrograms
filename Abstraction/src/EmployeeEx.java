import java.util.Scanner;
abstract class Employee{
	private String name;
	private double id;
	Employee(String name,double id){
		this.name=name;
		this.id=id;
	}
	void Display() {
		System.out.println("NAME:"+name);
		System.out.println("ID:"+id);
	}
}
class Engineer extends Employee{
	Engineer(String name,double id){
		super(name,id); //inderict instation of base class
	}
}
public class EmployeeEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NAME OF EMPLOYEE:");
		String name=sc.nextLine();
		System.out.println("ENTER EMPLOYEE ID:");
		double id=sc.nextDouble();
		
		Engineer e=new Engineer(name,id);
		e.Display();

	}

}
