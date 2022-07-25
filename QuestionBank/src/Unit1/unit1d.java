package Unit1;
import java.util.Scanner;

class university{
	String collegeName;
	String collegeCode;
	
	university(String cn,String cc){
		collegeName=cn;
		collegeCode=cc;
	}
	 public String toString() {
		return "College Name: "+collegeName+"  College Code: "+collegeCode;
	}
}

class colleges extends university{
	String Departments;
	String Programs;
	
	colleges(String d,String p,String cn,String cc){
		super(cn,cc);
		Departments=d;
		Programs=p;
	}
	public String toString() {
		return " "+super.toString()+"  Departments: "+Departments+"  Programs:"+Programs;
	}
}

class Departments extends colleges{
	String programOffered;
	int totalIntake;
	
	Departments(String po,int t,String d,String p,String cn,String cc){
		super(d,p,cn,cc);
		programOffered=po;
		totalIntake=t;
	}
	
	public String toString() {
		return " "+super.toString()+"  Programs offered: "+programOffered+"  Total intake: "+totalIntake;
	}
}
public class unit1d {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the college  name:");
			String name=sc.next();
			System.out.println("Enter the college  code:");
			String code=sc.next();
			System.out.println("Enter Departments in college "+name+": ");
			String dept=sc.next();
			System.out.println("Enter programs in college "+name+" :");
			String prog=sc.next();
			System.out.println("Enter the programs offered  in department "+dept+" :");
			String progOffered=sc.next();
			System.out.println("Enter the total intake for department "+dept+" :");
			int intake=sc.nextInt();
			
			university uObj=new Departments(progOffered,intake,dept,prog,name,code);
			System.out.println(uObj.toString());
	}

}
