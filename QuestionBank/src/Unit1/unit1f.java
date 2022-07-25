package Unit1;
class Employee{
	String name;
	String department;
	String id;
	static String ceo;
	
	Employee(String name, String department, String id) {
		this.name = name;
		this.department = department;
		this.id = id;
	}
	
	void Show() {
		System.out.println("Details of employee are:");
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
		System.out.println("ID: "+id);
		System.out.println("Ceo of company: "+ceo);
		System.out.println();
	}
}

public class unit1f {

	public static void main(String[] args) {
		Employee obj1=new Employee("Kallayya","Devolepment","DVOP1032");
		Employee obj2=new Employee("Naveen","Marketing","MARK1234");
		Employee.ceo="Bill Gates";
		obj1.Show();
		obj2.Show();
		
		Employee.ceo="Sundar Pichai";
		
		obj1.Show();
		obj2.Show();
	}

}
