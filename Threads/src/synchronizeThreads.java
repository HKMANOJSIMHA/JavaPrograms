/*write a java  program to create two different threads for printing two different 
 * multiplication table for n1 and n2 respectively with normal thread execution
 * then apply simple synchronization mechanism for proper multiplication table */
import java.util.Scanner;
class table1 extends Thread{
	int n;
	table1(int n){
		this.n=n;
	}
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(n*i);
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {
			System.out.println("Interrupted exception"+ex);
		}
	}
}

class table2 extends Thread{
	int n;
	table2(int n){
		this.n=n;
	}
	public void run() {
		for(int i=1;i<=10;i++)
			System.out.println(n*i);
		try {
			Thread.sleep(2000);
		}catch(Exception ex) {
			System.out.println("Interrupted exception"+ex);
		}
	}
}
public class synchronizeThreads {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		table1 t1=new table1(2);
		table2 t2=new table2(10);
		
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException e) {
			System.out.println("Interrupted exception"+e);
		}
		t2.start();
		
	}

}
