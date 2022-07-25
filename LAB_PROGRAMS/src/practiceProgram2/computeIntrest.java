package practiceProgram2;

class computeIntrest extends SimpleIntrest{
	double p,t,r;
	computeIntrest(double p,double t,double r){
		this.p=p;
		this.t=t;
		this.r=r;
	}
	void compute() {
		result=(p*t*r)/100;
    }
}