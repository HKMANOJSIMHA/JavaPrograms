package practiceProgram3;
import java.util.Scanner;
public class PracticeProgram3 {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("ENTER AN INTEGER:");
	     int n=sc.nextInt();
	     
	     computeEven even_obj=new computeEven(n);
	     boolean result=even_obj.CheckEven();
	     
	     if(result==true)
	    	 System.out.println(n+" IS EVEN");
	     else
	    	 System.out.println(n+" IS ODD");
	}

}

