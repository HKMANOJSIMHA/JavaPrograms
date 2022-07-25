/*write a java program to print n different numbers with thread mechanism using extends
 * thread and implements runnable*/
class ThreadRunnable implements Runnable{
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
public class threadEx2 {

	public static void main(String[] args) {
		ThreadRunnable r1=new ThreadRunnable();
		Thread t1=new Thread(r1);
		t1.run();
	}

}