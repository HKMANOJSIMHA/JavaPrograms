package Unit2;

class checkEqual{
	int n1,n2,n3;

	public checkEqual(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	void check() {
		if(n1==n2&&n2==n3&&n1==n3) {
			System.out.println("All numbers are equal");
		}
		else if(n1!=n2&&n2!=n3&&n1!=n3) {
			System.out.println("All numbers are different");
		}
		else
			System.out.println("Neither all are equal or different");
	}
	
}

public class unit2g {

	public static void main(String[] args) {
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		
		checkEqual eqObj=new checkEqual(n1,n2,n3);
		eqObj.check();
	}

}
