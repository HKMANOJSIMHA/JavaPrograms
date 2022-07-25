
public class annonymusClassThreads {

	public static void main(String[] args) {
		Thread t1=new Thread() {
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
		};
		
		Thread t2=new Thread() {
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
		};
		t1.start();
		t2.start();

	}

}
