/*write a java program to print all the prime numbers between 1 and n use this 
 * functionality by two different thread classes which calls prime functions by 
 * creating objects of main class the main class creates objects of different thread 
 * classes to print prime numbers*/
import java.util.Scanner;
class printPrime{
	synchronized void prime(int n) {
		System.out.println("Prime numbers between 1-"+n+" is:");
		for(int i=2;i<=n;i++) {
			int count=0;
			for(int j=2;j<=n/2;j++) {
				if(i%j==0)
					count++;
			}
			if(count==0)
				System.out.println(i);
		}
	}
}

class thread1 extends Thread{
	printPrime p;
	thread1(printPrime p){
		this.p=p;
	}
	public void run() {
		p.prime(25);
	}
}

class thread2 extends Thread{
	printPrime p;
	thread2(printPrime p){
		this.p=p;
	}
	public void run() {
		p.prime(20);
	}
}

public class synchronizedEx {

	public static void main(String[] args) {
		printPrime p1=new printPrime();
		thread1 t1=new thread1(p1);
		thread2 t2=new thread2(p1);
		
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		t2.start();
	}

}
