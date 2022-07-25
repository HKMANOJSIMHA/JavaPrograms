package Unit3;

import java.util.Scanner;

abstract  class  Employee{
double  earnings;
Scanner  sc  =  new  Scanner(System.in); 
	Employee(){
		   System.out.println("Enter  earnings:"); 
		   earnings  =  sc.nextDouble();
   }

abstract  void  calculatePay  ();
}

class  hourlyEmployee  extends  Employee{
	double  hourlyRate,sal,overtimeRate; 
	Scanner  sc  =  new  Scanner(System.in); 
	
	hourlyEmployee(){
			System.out.println("Enter  Hourly  Rate:");
			hourlyRate  =  sc.nextDouble(); 
			System.out.println("Enter  Overtime  Rate:"); 
			overtimeRate  =  sc.nextDouble();
     }
	
	void  calculatePay(){
			sal  =  earnings+hourlyRate+overtimeRate; 
			System.out.println("Salary:  "+sal);
	}
}

class  salariedEmployee  extends  Employee{
	double  weeklyRate,sal; 
	Scanner  sc  =  new  Scanner(System.in); 
	salariedEmployee(){
			System.out.println("Enter  Weekly  Rate:"); 
			weeklyRate  =  sc.nextDouble();
	}
	void  calculatePay(){
			sal  =  earnings+weeklyRate; 
			System.out.println("Salary:  "+sal);
	}
}

class  exemptEmployee  extends  Employee{
	double  monthlyRate,sal; 
	Scanner  sc  =  new  Scanner(System.in); 
	
	exemptEmployee(){
			System.out.println("Enter  Monthly  Rate:"); 
			monthlyRate  =  sc.nextDouble();
	}
	
	void  calculatePay(){
			sal  =  earnings+monthlyRate; 
			System.out.println("Salary:  "+sal);
	}
}


public class unit3c {

	public static void main(String[] args) {
		Employee  eObj; 
		System.out.println("Hourly Employee salary details:");
		eObj=new hourlyEmployee();
		eObj.calculatePay();
		System.out.println();
		
		System.out.println("Salaried Employee salary details:");
		eObj=new  salariedEmployee(); 
		eObj.calculatePay();
		System.out.println();
		
		System.out.println("Exempt Employee salary details:");
		eObj=  new  exemptEmployee(); 
		eObj.calculatePay();

	}

}
