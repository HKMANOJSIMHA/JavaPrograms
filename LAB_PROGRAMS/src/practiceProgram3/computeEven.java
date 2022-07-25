package practiceProgram3;

class computeEven{
	int number;
	computeEven(int number){
		this.number=number;
	}
	
	boolean CheckEven() {
		if(number%2==0)
			return true;
		else 
		    return false;
	}
}