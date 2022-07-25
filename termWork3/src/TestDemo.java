import advancedArithematic.advanced;
import basicArithematic.basic;
public class TestDemo {

	public static void main(String[] args){

		int choice=Integer.parseInt(args[0]);
		int subChoice=Integer.parseInt(args[1]);
		double n1=Double.parseDouble(args[2]);
		double n2=Double.parseDouble(args[3]);

		basic basicObj=new basic();
		advanced advancedobj=new advanced();

		switch(choice){

			case 1:System.out.println("-------BASCI MATH OPERATION-------");

			       switch(subChoice){

			       	case 1:System.out.println("SUM OF "+n1+" AND "+n2+" IS: "+basicObj.addition(n1,n2));
			       	       break;

			       	case 2:System.out.println("DIFFERENCE OF "+n1+" AND "+n2+" IS: "+basicObj.subtraction(n1,n2));
			       	       break;

			       	case 3:System.out.println("PRODUCT OF "+n1+" AND "+n2+" IS: "+basicObj.multiplication(n1,n2));
			       	       break;

			       	case 4:System.out.println("QUOTIENT OF "+n1+" AND "+n2+" : "+basicObj.division(n1,n2));
			       	       break;

			       	default:System.out.println("INVALID OPTION");
			       }
			       break;

			case 2:System.out.println("-------ADVANCED MATH OPERATION-------");

			       switch(subChoice){

			       	case 1:System.out.println("SINE OF ANGLE "+n1+" IS:"+advancedobj.sine(n1));
			       		   break;

			        case 2:System.out.println("ABSOLUTE VALUE OF "+n1+" IS:"+advancedobj.absloute(n1));
			       		   break;

			        case 3:System.out.println("LOG BASE 10 OF "+n1+" IS:"+advancedobj.logBase10(n1));
			       		   break;

			        default:System.out.println("INVALID OPTION");
			       }
			       break;
			       
			default:System.out.println("INVALID OPTION");
		}
	}
}