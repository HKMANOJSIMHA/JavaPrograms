package termWork2;
import java.time.LocalDate;
import java.util.Scanner;
public class TermWork2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean member=false;
		String memberType="";
		discountRate d=new discountRate();
			System.out.println("WELCOME TO BEAUTY PARLOUR:");
			System.out.print("ENTER YOUR NAME:");
			String name=sc.next();
			System.out.println("ARE YOU A MEMBER:");
			System.out.printf("Press\n1 FOR YES\n0 FOR NO\n");
			int choice=sc.nextInt();
			if(choice==1) {
				member=true;
				System.out.print("SELECT MEMBER TYPE:");
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
			System.out.print("ENTER DATE IN FORMAT(Year Month day):");
			int year=sc.nextInt();
			int Month=sc.nextInt();
			int day=sc.nextInt();
			System.out.print("ENTER THE SERVICE EXPENSES:");
			double sExp=sc.nextDouble();
			System.out.print("ENTER THE PRODUCT :");
			double pExp=sc.nextDouble();
			Customer c=new Customer();
			c.setMember(member);
			c.setmemberType(memberType);
			visit v=new visit(c,name,LocalDate.of(year, Month, day));
			v.setserviceExpenses(sExp);
			v.setProductExpenses(pExp);
			System.out.println("\n");
			System.out.println(v.toString());
			System.out.println("AMOUNT TO BE PAID: "+(sExp+pExp));
			double sTotal=v.getserviceExpenses()-v.getserviceExpenses()*d.getserviceDiscountRate(memberType);
			double pTotal=v.getproductExpenses()-v.getproductExpenses()*d.getproductDiscountRate(memberType);
			System.out.println("SERVICE DISCOUNT: "+(sExp-sTotal));
			System.out.println("PRODUCT DISCOUNT: "+(pExp-pTotal));
			System.out.println("TOTAL DISCOUNT APPLIED IS: "+(v.getproductExpenses()*d.getproductDiscountRate(memberType)+v.getserviceExpenses()*d.getserviceDiscountRate(memberType)));
			System.out.println("AMOUNT TO BE PAID AFTER DISCOUNT: "+(sTotal+pTotal));
			System.out.println("\n");
			System.out.println("THANK YOU VISIT AGAIN");
		
	}

}
