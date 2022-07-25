/*write a java program to print n different numbers with thread mechanism using extends
 * thread and implements runnable*/
class printThread extends Thread{
	public void run() {
		try {
			Thread t=Thread.currentThread();
			for(int i=0;i<=10;i++)
				System.out.println(t+" "+i);
				Thread.sleep(1000);
		}catch(Exception ex) {
			System.out.println("Main thread interrupted"+ex);
		}
	}
}
public class threadEx1 {

	public static void main(String[] args) {
		printThread t1=new printThread();
		printThread t2=new printThread();
		t1.start();
		t2.start();

	}

}
