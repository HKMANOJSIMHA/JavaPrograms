/*write a java program to implement abstract keyword in the following scenario:
 * there is a person having the important attributes of name and age a person working for a company to be called as employee has added attributes department and salary 
 * the salary of the employee is based on the following criteria:
 * if the employee is a manager than salary=salary+10%HRA + 80%TA
 * if the employee is team leader than salary is salary+5%HRA +60%DA
 * other wise salary is salary +3%HRA +45%TA
 * Based on the kind of the Employee details has to be displayed along with his or her name or age*/

abstract class person{
	String name;
	int age;
	
	public person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	abstract double compute_salary();
	
	void display_details(double tot_salary) {
		System.out.print("Name:"+name+"\nAge:"+age+"\nSalary:"+tot_salary+"\n");
	}
}

class employee extends person{
	String dept;
	float salary;
	public employee(String name, int age, String dept, float salary) {
		super(name, age);
		this.dept = dept;
		this.salary = salary;
	}
	
	double compute_salary() {
		if(dept.equals("Manager"))
			return salary+0.10*salary+0.80*salary;
		else if(dept.equals("Leader"))
			return salary+0.05*salary+0.60*salary;
		else
			return salary+0.03*salary+0.45*salary;
	}
}
public class Abstraction{
	public static void main(String []args) {
		
		employee e1=new employee("Manoj",20,"Manager",20000);
		double tot_salary=e1.compute_salary();
		e1.display_details(tot_salary);
		
		employee e2=new employee("Mannu",20,"Leader",10000);
		tot_salary=e2.compute_salary();
		e2.display_details(tot_salary);
		
		employee e3=new employee("Ani",20,"compounder",5000);
		tot_salary=e3.compute_salary();
		e3.display_details(tot_salary);
		
	}
}
