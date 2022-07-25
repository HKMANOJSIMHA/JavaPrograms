/*write a java program to create two threads say t1 and t2 thread t1 prints the factorial of a given number
 *thread t2 prints sum of all its divisior along with all its divisors*/
class factorial extends Thread{
	public void run() {
		int fact=1;
		System.out.println("Thread running is:"+Thread.currentThread().getName());
		try {
			for(int i=1;i<=5;i++) {
				fact=fact*i;
			}
			System.out.println("5!="+fact);
		}catch(Exception ex) {
			System.out.println("Exception in main thread"+ex);
		}
	}
}

class divisor extends Thread{
	public void run() {
		int sum=0;
		System.out.println("Thread running is:"+Thread.currentThread().getName());
		try {
			for(int i=1;i<=10;i++) {
				if(10%i==0) {
					System.out.println(i);
					sum=sum+i;
				}
			}
			System.out.println("Sum of divisors of 10 is:"+sum);
		}catch(Exception ex) {
			System.out.println("Exception in main thread"+ex);
		}
	}
}
public class threadEx4 {

	public static void main(String[] args) {
		factorial t1=new factorial();
		divisor t2=new divisor();
		
		t1.setName("factorialThread");
		t2.setName("divisorThread");
		
		t1.start();
		t2.start();
	}

}
