/*Write a java program to create two threads where t1 is printing between 1 and 10 and 
 * thread t2 is printing all even numbers between 1 and 10 before printing the respective
 * numbers associate thread name with number names of threads are even thread and odd thread
 */
class even extends Thread{
	public void run() {
		try {
			Thread t=Thread.currentThread();
			t.setName("EvenThread");
			for(int i=2;i<=10;i+=2)
				System.out.println(t+" "+i);
		}catch(Exception ex) {
			System.out.println("Exception in main thread"+ex);
		}
	}
}

class odd extends Thread{
	public void run() {
		try {
			Thread t=Thread.currentThread();
			t.setName("OddThread");
			for(int i=1;i<=10;i+=2)
				System.out.println(t+" "+i);
		}catch(Exception ex) {
			System.out.println("Exception in main thread"+ex);
		}
	}
}
public class threadEx3 {

	public static void main(String[] args) {
		even t1=new even();
		odd t2=new odd();
		
		t1.start();
		t2.start();
	}

}
