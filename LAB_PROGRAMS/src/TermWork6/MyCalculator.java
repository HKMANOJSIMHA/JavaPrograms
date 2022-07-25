package TermWork6;

class MyCalculator implements  AdvanceArithmetic{
	public int divisorSum(int n) {
		if(n>1000)
			return -1;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
				sum+=i;
		}
		return sum;
	}
}