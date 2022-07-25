package admission;

public class admissionDetails {

	public void displayDetails(String type,int fee){
		if(type.equals("CET"))
			System.out.println("Quota:CET\nFees to be paid:"+fee+"\n");
		else if(type.equals("COMEDK"))
			System.out.print("Quota:COMED-K\nFees to be paid:"+fee+"\n");
		else if(type.equals("MGMT"))
			System.out.println("Quota:MANAGEMENT\nFees to be paid:"+fee+"\n");
		else
			System.out.println("Invalid type");
	}
}
