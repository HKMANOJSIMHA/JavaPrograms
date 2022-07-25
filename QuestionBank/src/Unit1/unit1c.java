/*Encapsulation is one of the fundamentals of OOP (object-oriented programming). 
It refers to the bundling of data with the methods that operate on that data. 
Encapsulation is used to hide the values or state of a structured 
data object inside a class, preventing unauthorized parties direct access to them.*/
package Unit1;
import java.util.Scanner;
class Students{
	private String name;
	private String regNo;
	private int semester;
	private double fees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegNo() {
		return regNo;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
}

public class unit1c {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of the student:");
		String name=sc.next();
		System.out.println("Enter the register number:");
		String regNo=sc.next();
		System.out.println("Enter the semester:");
		int sem=sc.nextInt();
		System.out.println("Enter the fees of the student:");
		double fees=sc.nextDouble();
		
		Students sObj=new Students();
		sObj.setFees(fees);
		sObj.setName(name);
		sObj.setRegNo(regNo);
		sObj.setSemester(sem);
		
		System.out.println("Details of student are:");
		System.out.println("Name: "+sObj.getName());
		System.out.println("Semester: "+sObj.getSemester());
		System.out.println("Registration number: "+sObj.getRegNo());
		System.out.println("Fees: "+sObj.getFees());
		}

}
