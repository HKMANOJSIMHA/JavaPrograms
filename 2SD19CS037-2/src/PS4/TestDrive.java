package PS4;
import java.util.Scanner;

interface Actions{
	void deposit(double amt);
	void withdrawl(double amt);
	void displayBalance();
}

abstract class account implements Actions{
	final String accHolder;
	final String accNumber;
	String address;
	static String accType;
	double initAmount;
	account(String accHolder, String accNumber, String address, String accType, double initAmount) {
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		this.address = address;
		this.accType = accType;
		this.initAmount = initAmount;
		System.out.println("Account details are:");
		System.out.print("Name:"+accHolder+"\nAccount Number:"+accNumber+"\nAccount tye:"+accType+"\n");
		System.out.print("Address:"+address+"\nInitial amount:"+initAmount+"\n");
	}
	account(String accHolder, String accNumber, double initAmount) {
		this.accHolder = accHolder;
		this.accNumber = accNumber;
		this.initAmount = initAmount;
		System.out.println("Account details are:");
		System.out.print("Name:"+accHolder+"\nAccount Number:"+accNumber+"\n");
		System.out.print("Initial amount:"+initAmount+"\n");
	}
	
}

class implementation extends account{
	double temp;
	implementation(String accHolder, String accNumber, double initAmount) {
		super(accHolder, accNumber, initAmount);
	}
	
	implementation(String accHolder, String accNumber, String address,String accType,double initAmount) {
		super(accHolder,accNumber,address,accType,initAmount);
	}
	
	public void deposit(double amt) {
		super.initAmount=super.initAmount+amt;
		System.out.println("Amount deposited is:"+amt);
		System.out.println("Available balance:"+(super.initAmount));
	}
	public void withdrawl(double amt) {
		super.initAmount=super.initAmount-amt;
		if(super.initAmount<=0) {
			System.out.println("Insufficient Balance");
			super.initAmount=temp;
		}
		else {
			System.out.println("Amount credited is:"+amt);
			System.out.println("Available balance:"+(super.initAmount));
		}
	}
	public void displayBalance(){
		System.out.println("Available balance is:"+super.initAmount);
	}
	
	
	
}

public class TestDrive {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		for(;;) {
			System.out.println("------------WELCOME TO SDM BANK LTD------------");
			System.out.println("Enter your account details:");
			System.out.print("Account Holder Name:");
			String name=sc.next();
			System.out.print("Account Number:");
			String number=sc.next();
			System.out.print("Initial amount:");
			double init=sc.nextDouble();
			System.out.print("Do you want to enter account type and address:?\n1-YES\n0-NO\n");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.print("Account Type:");
				String type=sc.next();
				System.out.print("Address:");
				String address=sc.next();
				account h1=new implementation(name,number,address,type,init); //Runtime Polymorphism
				for(;;) {
					System.out.println("Select the action to be performed:");
					System.out.print("1-Deposit\n2-Withdrawl\n3-Balanceenquiry\n4-Exit\n");
					int ch=sc.nextInt();
					switch(ch) {
					case 1:System.out.println("Enter the amount to be deposited:");
						   double dep=sc.nextDouble();
						   h1.deposit(dep);
						   break;
					case 2:System.out.println("Enter the amount to be withdrawn:");
					       double wd=sc.nextDouble();
					       h1.withdrawl(wd);
					       break;
					case 3:h1.displayBalance();
						   break;
					case 4:System.out.println("Thankyou visit again!!!");
					   	   System.exit(0);
					default:System.out.println("Invalid choice");
						    break;
					}
				}
			}
			else if(choice==0){
				account h1=new implementation(name,number,init);   //Runtime Polymorphism
				for(;;) {
					System.out.println("Select the action to be performed:");
					System.out.print("1-Deposit\n2-Withdrawl\n3-Balanceenquiry\n4-Exit\n");
					int ch=sc.nextInt();
					switch(ch) {
					case 1:System.out.println("Enter the amount to be deposited:");
						   double dep=sc.nextDouble();
						   h1.deposit(dep);
						   break;
					case 2:System.out.println("Enter the amount to be withdrawn:");
					       double wd=sc.nextDouble();
					       h1.withdrawl(wd);
					       break;
					case 3:h1.displayBalance();
						   break;
					case 4:System.out.println("Thankyou visit again!!!");
						   System.exit(0);
					default:System.out.println("Invalid choice");
						    break;
					}
				}
			}
			else {
				System.out.println("Invalid Choice");
			}
			
			
		}
		
	}

}
