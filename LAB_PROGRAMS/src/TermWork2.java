import java.time.LocalDate;
import java.util.Scanner;
class Customer {
	String name;
	boolean member;
	String memberType;
	
	public Customer(String name) {
		this.name=name;
	}
	void setMember(boolean member) {
		this.member=member;
	}
	public boolean isMember() {
		return member;
	}
	public void setmemberType(String memberType ) {
		this.memberType=memberType;
	}
	public String getmemberType() {
		return memberType;
	}
	public String toString() {
		if(member==false)
			return "NAME OF CUSTOMER: "+name
				  +"	IS HE A MEMBER: NO";
		else
			return "NAME OF CUSTOMER: "+name
					+"	IS HE A MEMBER: YES"
					+"	MEMBER TYPE: "+memberType.toUpperCase();
	}

}

 	class discountRate {
 		public static double serviceDiscountPremium=0.2;
 		public static double serviceDiscountGold=0.15;
 		public static double serviceDiscountSilver=0.1;
 		public static double productDiscountMember=0.1;
	
	public double getserviceDiscountRate(String type) {
		switch(type) {
		case "Premium":return serviceDiscountPremium;
		case "Gold":return serviceDiscountGold;
		case "Silver":return serviceDiscountSilver;
		default:return 0;
		}
	}
	public double getproductDiscountRate(String type) {
		switch(type) {
			case "Premium":
			case "Gold":
			case "Silver":return productDiscountMember;
			default:return 0;
		}
	}
		
}
class visit {
 		Customer customer;
 		discountRate discount;
 		LocalDate date;
 		double serviceExpenses;
 		double productExpenses;
 		
 		public visit(Customer c,discountRate d,LocalDate date) {
 			this.date=date;
 			customer=c;
 			discount=d;
 		}
 		public void setserviceExpenses(double serviceExpenses) {
 			this.serviceExpenses=serviceExpenses-serviceExpenses*discount.getserviceDiscountRate(customer.memberType);
 		}
 		public double getserviceExpenses() {
 			return serviceExpenses;
 		}
 		public void setProductExpenses(double productExpenses) {
 			this.productExpenses=productExpenses-productExpenses*discount.getproductDiscountRate(customer.memberType);
 		}
 		public double getproductExpenses() {
 			return productExpenses;
 		}
 		public double gettotalExpenses() {
 			return serviceExpenses+productExpenses;
 		}
 		public String toString() {
 			return customer.toString()
 					+"	DATE OF VISIT: "+date
 					+"	SERVICE EXPENSES: "+serviceExpenses
 					+"	PRODUCT EXPENSES: "+productExpenses;
 		}

 	}

	
public class TermWork2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean member=false;
		String memberType="";
		discountRate d=new discountRate();
			System.out.println("WELCOME TO BEAUTY PARLOUR:");
			System.out.print("Enter your name:");
			String name=sc.next();
			System.out.println("Are you a member:");
			System.out.printf("Press\n1 for yes\n0 for no\n");
			int choice=sc.nextInt();
			if(choice==1) {
				member=true;
				System.out.print("Select your Member Type:");
				System.out.printf("\np/p:Premium\ng/G:gold\ns/S:Silver\n");
			    char ch=sc.next().charAt(0);
			    switch(ch) {
			    case 'p':
			    case 'P':memberType="Premium";
			             break;
			    case 'g':
			    case 'G':memberType="Gold";
			             break;
			    case 's':
			    case 'S':memberType="Silver";
			             break;
			    }
			}
			else if(choice==0) {
				member=false;
			}
			System.out.print("Enter the date in format(Year Month day):");
			int year=sc.nextInt();
			int Month=sc.nextInt();
			int day=sc.nextInt();
			System.out.print("Enter the service expenses:");
			double sEx=sc.nextDouble();
			System.out.print("Enter the product expenses:");
			double pEx=sc.nextDouble();
			Customer c=new Customer(name);
			c.setMember(member);
			c.setmemberType(memberType);
			visit v=new visit(c,d,LocalDate.of(year, Month, day));
			v.setserviceExpenses(sEx);
			v.setProductExpenses(pEx);
			System.out.println("\n");
			System.out.println(v.toString());
			System.out.println("AMOUNT TO BE PAID: "+(sEx+pEx));
			System.out.println("SERVICE DISCOUNT: "+(sEx-v.getserviceExpenses()));
			System.out.println("PRODUCT DISCOUNT: "+(pEx-v.getproductExpenses()));
			System.out.println("TOTAL DISCOUNT APPLIED IS: "+(sEx+pEx-v.gettotalExpenses()));
			System.out.println("AMOUNT TO BE PAID AFTER DISCOUNT: "+v.gettotalExpenses());
			System.out.println("\n");
			System.out.println("THANK YOU VISIT AGAIN");
		
	}

}

