package TermWork5;

class calculatePrime{
	synchronized void getPrime(int n1,int n2) {
		System.out.println("The prime numbers in the range "+n1+" to "+n2+" are:");
		for(int i=n1;i<=n2;i++) {
			int check=0;
			if(i!=1) {
				for(int j=2;j<=i/2;j++) {
					if(i%j==0) {
						check++;
					}
				}
				if(check==0)
					System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println();
	}
	
}

class createThread extends Thread{
	int n1,n2;
	calculatePrime c;
	public createThread(int n1, int n2, calculatePrime c) {
		this.n1 = n1;
		this.n2 = n2;
		this.c = c;
	}
	
	public void run() {
		c.getPrime(n1, n2);
	}
	
}

public class termWork5 {

	public static void main(String[] args) {
		calculatePrime c=new calculatePrime();
		createThread t1=new createThread(1,100,c);
		createThread t2=new createThread(101,200,c);
		createThread t3=new createThread(201,300,c);
		
		t1.start();
		try {
			t1.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		}catch(InterruptedException ie) {
			ie.printStackTrace();
		}

	}

}
