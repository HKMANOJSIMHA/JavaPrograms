/*Write a java program to create a class employee which has details like employee id, department, salary and mobile number.
Each employee has associated project, which can be assigned to multiple employees and each such project has project ID and name.
Implement the following operations such that employee and project classes are having proper relationship to show which employee belongs 
to which project
1.Create data collection of employee details.
2.Display all employees details belonging to a given project ID.*/
import java.util.Scanner;
class employee1{
	String id;
	String dept;
	float salary;
	long  mobileNo;
	int pid;
	String pname;
	
	public employee1(String id, String dept, float salary, long mobileNo, int pid, String pname) {
		this.id = id;
		this.dept = dept;
		this.salary = salary;
		this.mobileNo = mobileNo;
		this.pid = pid;
		this.pname = pname;
	}
	
	void fnDisplay() {
		System.out.printf("%10s%5lf%5s%10d%5d%10s\n",id,salary,dept,pid,pname);
	}
	
	
	
}
public class Ex11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of employee:");
		int n=sc.nextInt();
		employee1 e[];
		e=new employee1[n];
		
	}

}
