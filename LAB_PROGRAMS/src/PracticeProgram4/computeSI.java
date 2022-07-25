package PracticeProgram4;

class computeSI extends sIntrest{
	computeSI(int age,double amount,double t){
		super(age,amount,t);
	}
	@Override
	double computeIntrest() {
		if(age<60) {
			if(amount>5000000)
				return (amount*t*5.5)/(100);
			else
				return (amount*t*6.0)/(100);
		}
		else {
			if(amount>5000000)
				return (amount*t*6.0)/(100);
			else
				return (amount*t*6.5)/(100);
		}
	}
	void DisplayCitizenDetails() {
		System.out.println("CITIZEN AGE:"+age);
		System.out.println("AMOUNT DEPOSITED IS:"+amount);
	}
}
