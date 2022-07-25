/*Write a jav program to create two threads where first thread finds all the prime numbers
 *from 1 to 20 the second thread prints multiplication table of given number on console*/
import java.util.Scanner;
public class threadEx5 {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Thread prime=new Thread() {
			int count=0;
			public void run() {
				for(int i=2;i<=10;i++) {
					for(int j=2;j<=i/2;j++) {
						if(i%j==0) {
							count++;
						}
					}
					if(count==0) {
						System.out.println(i);
					}
					count=0;
				}
			}
		};
		Thread mulTable=new Thread() {
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println((i*5));
				}
			}
		};
		
		prime.start();
		mulTable.start();
	}

}
