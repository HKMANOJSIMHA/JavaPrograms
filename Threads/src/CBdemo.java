/*there are three threads t1,t2,main t1 computes product of of two integer t2 computes sum of two integers the main thread compute the
 * result which is sum total of product and sum computed by t1 and t2
 * 
 */
import java.concurrency.*
class compute2 implements Runnable{
	public static int sum=0;
	public void run() {
		sum=3+5;
		try {
			CBdemo.barrier.wait();
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
			CBdemo.barrier.wait();
			
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
	}
}


public class CBdemo implements Runnable {
	
	public static CyclicBarrier barrier=new CyclicBarrier();
	
	public void run() {
		try {
			barrier.wait();
		}catch(InterruptedException ie) {
			System.out.println(ie);
		}
		compute1 c1=new compute1();
		compute2 c2=new compute2();
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
		System.out.println("Result="+compute1.product+compute2.sum);
	}

	public static void main(String[] args) {
		CBdemo cb=new CBdemo();
		Thread main=new Thread(cb);
		main.start();
	}

}