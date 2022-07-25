import java.util.Scanner;
abstract class bank{
	double intrest;
	abstract void setIntrest();
	double getIntrest() {
		return intrest;
	}
}
class sbi extends bank{
	void setIntrest() {
		intrest=6.5;
	}
}
class kbl extends bank{
	void setIntrest() {
		intrest=6;
	}
}
public class BankEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sbi s=new sbi();
		kbl k=new kbl();
		System.out.println("ENTER THE NAME OF THE BANK:");
		String bank= sc.next();
		if(bank.equals("SBI")) {
			s.setIntrest();
			System.out.println("INREST FOR SBI IS:"+s.getIntrest());
		}
		else if(bank.equals("KBL")) {
			k.setIntrest();
			System.out.println("INTREST FOR KBL IS :"+k.getIntrest());
		}
		else
			System.out.println("INVALID BANK NAME");
		
			
		
	}

}
