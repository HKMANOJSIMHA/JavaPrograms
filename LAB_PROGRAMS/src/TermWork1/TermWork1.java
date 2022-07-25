package TermWork1;
import java.util.Scanner;
public class TermWork1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	 for(;;) {
    		      System.out.println("ENTER YOUR CHOICE:");
    	    	  System.out.println("1-IF PERSON IS STUDENT");
    	    	  System.out.println("2-IF PERSON IS STAFF MEMBER");
    	    	  System.out.println("3-EXIT");
    	    	int choice=sc.nextInt();
    		switch(choice) {
        	case 1:System.out.println("ENTER THE NAME:");
        	       String name=sc.next();
        	       System.out.println("ENTER THE ADDRESS:");
        	       String address=sc.next();
        	       System.out.println("ENTER THE CURRENT PROGRAM:");
        	       String program=sc.next();
        	       System.out.println("ENTER THE CURRENT YEAR:");
        	       int year=sc.nextInt();
        	       System.out.println("ENTER YOUR FEE:");
        	       double fee=sc.nextDouble();
        	       
        	       Student sObj=new Student(name,address,program,year,fee);
        	       System.out.println(sObj.toString());
        	       System.out.printf("\n");
        	       break;
        	case 2:System.out.println("ENTER THE NAME:");
 	               name=sc.next();
 	               System.out.println("ENTER THE ADDRESS:");
 	               address=sc.next();
 	               System.out.println("ENTER THE SCHOOL NAME:");
       	           String school=sc.next();
       	           System.out.println("ENTER YOUR PAY:");
     	           double pay=sc.nextDouble();  
     	
     	           Staff stObj=new Staff(name,address,school,pay);
       	           System.out.println(stObj.toString());
       	           System.out.printf("\n");
       	           break;
        	case 3:System.out.println("THNKYOU!!");
        	       System.exit(0);
        	       
        	default:System.out.println("INVALID CHOICE:");
        	        System.out.println();
        	}
    	}
    	
	}

}

