/*there are three threads t1,t2,main t1 computes product of of two integer t2 computes sum of two integers the main thread compute the
 * result which is sum total of product and sum computed by t1 and t2
 * 
 */
class compute2 implements Runnable{
	public static int sum=0;
	public void run() {
		sum=3+5;
		try {
			
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
}

class compute1 implements Runnable{
	public static int product=0;
	public void run() {
		product=3+5;
		try {
			
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
}


public class CyclicBarrier implements Runnable {
	
	public void run() {
		System.out.println("Result="+compute1.product+compute2.sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
