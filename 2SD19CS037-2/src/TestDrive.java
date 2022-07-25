import java.util.Scanner;
interface HRManagement {
	void displayDetails();
	void calSalary();
}

abstract class EmployeeInfo implements HRManagement{
	String empID;
	String empName;
	double empSalary;
	
	EmployeeInfo(String Id,String name,double salary){
		empID=Id;
		empName=name;
		empSalary=salary;
	}
}

class Manager extends EmployeeInfo{
	
	Manager(String Id,String name,double salary) {
		super(Id,name,salary);
	}
	
	public void calSalary() {
			System.out.println("Bonous:"+(0.05*super.empSalary));
			System.out.println("Total salary:"+(super.empSalary+(0.05*super.empSalary)));
	}
	public void displayDetails() {
		System.out.println("Employee name:"+super.empName);
		System.out.println("Employee ID:"+super.empID);
		System.out.println("Employee Salary:"+super.empSalary);
	}
}
public class TestDrive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee name:");
		String name=sc.next();
		System.out.println("Enter the employee ID:");
		String ID=sc.next();
		System.out.println("Enter the designation:");
		String desg=sc.next();
		
		if(desg.equals("Manager")) {
			EmployeeInfo e=new Manager(ID,name,25000);  //Runtime Polymorphism
			e.displayDetails();
			System.out.println("Designation"+desg);
			e.calSalary();
		}
		else if(desg.equals("Employee")) {
			EmployeeInfo e=new Manager(ID,name,20000);	//Runtime Polymorphism
			e.displayDetails();
			System.out.println("Designation"+desg);
			e.calSalary();
		}
		else
			System.out.println("Invalid Degignation");
	}

}
