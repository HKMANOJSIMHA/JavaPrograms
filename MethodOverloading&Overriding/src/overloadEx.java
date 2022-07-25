
public class overloadEx {
	void div(double a,double b) {
		if(b!=0)
			System.out.println("a/b="+(a/b));
		else
			System.out.println("Divide by zero error");
	}
	//overloaded method
	void div(double a,double b,double c) {
		if(c!=0)
			System.out.println("(a+b)/c="+(a+b)/c);
		else
			System.out.println("Divide by zero error");
	}

	public static void main(String[] args) {
		/*although the method div and main method are in same class object needs to created so that
		 encapsulation is taken care*/
		overloadEx obj=new overloadEx();
		obj.div(20,10);
		obj.div(30,20,10);
		obj.div(10,0);
		obj.div(20,30,0);
		

	}

}
