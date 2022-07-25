package PracticeProgram4;

abstract class sIntrest{
	 int age;
	 double amount;
	 double t;
	//parameterized constructor
	sIntrest(int age,double amount,double t){
		this.age=age;
		this.amount=amount;
		this.t=t;
	}
	abstract double computeIntrest();
}