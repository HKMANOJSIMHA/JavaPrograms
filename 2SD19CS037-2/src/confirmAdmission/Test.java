package confirmAdmission;
import admission.*;
import java.util.Scanner;

class feeMismatch extends Exception{
	
	void disply() {
		System.out.println("Exception in fees mismatch.Incorrect Fees");
	}
	
}
class selectquota {
	
	selectquota(){
		Scanner sc=new Scanner(System.in);
		admissionDetails a=new admissionDetails();
		for(;;) {
			System.out.println("Enter your quota:");
			System.out.print("CET-For CET quota\nCOMEDK-For COMED-K quota\nMGMT-For Management quota\n");
			String s1=sc.next();
			System.out.println("Enter the fee:");
			int fee=sc.nextInt();
			try {
				if(s1.equals("MGMT")) {
					if(fee<200000) {
						feeMismatch f=new feeMismatch();
						throw f;
					}
				}
			}
			catch(feeMismatch f) {
				f.disply();
				break;
			}
			a.displayDetails(s1,fee);
			System.out.println();
		}
	}

}

public class Test {

	public static void main(String[] args) {
		selectquota s1=new selectquota();

	}

}
