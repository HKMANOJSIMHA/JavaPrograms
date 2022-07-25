import java.util.Scanner;
class details{
	String Name;
	String Usn;
	String Branch;
	double Cgpa;
	void Display() {
		System.out.println("NAME\t\tUSN\t\t\tBRANCH\t\tCGPA\t");
		System.out.println("------------------------------------------------------------------");
		System.out.println(Name+"\t"+Usn+"\t\t "+Branch+"\t\t\t"+Cgpa);
	}
}
public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("ENTER THE NUMBER OF STUDENTS:");
		int n=sc.nextInt();
		details d[]=new details[n];
		for(int i=0;i<n;i++) {
			d[i]=new details();
			System.out.println("ENTER THE DETAILS OF STUDENT: "+(i+1));
			System.out.print("NAME:");
			d[i].Name=sc.next();
			System.out.print("USN: ");
			d[i].Usn=sc.next();
			System.out.print("BRANCH: ");
			d[i].Branch=sc.next();
			System.out.print("CGPA: ");
			d[i].Cgpa=sc.nextDouble();
			}
		System.out.println("ENTER THE USN OF STUDENT WHOSE DETAILS HAS TO BE PRINTED: ");
		String searchUsn=sc.next();
		for(int i=0;i<n;i++) {
			if(d[i].Usn.equals(searchUsn))
				d[i].Display();
			else
				count++;
		}
		if(count==n)
			System.out.println("STUDENT RECORD NOT FOUND");
	}

}
