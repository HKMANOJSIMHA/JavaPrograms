import java.util.Scanner;

class StackClass{
	int s[];
    int top;
	
	StackClass(int size){
		s=new int[size];
		top=-1;
	}
	
	public synchronized void push(int ele) {
		try {
			if(top==s.length) {
				wait();
			}
			else {
				s[++top]=ele;
				notify();
			}
				
		}catch(Exception e) {
			System.out.println("StackOverflow");
		}
			
	}
	
	public synchronized void pop() {
		try {
			if(top<0)
				wait();
			else {
				System.out.println("ITEM POPPED IS:"+s[top--]);
				notify();
			}
		}catch(Exception e) {
			System.out.println("StackOverflow");
		}
		
	}
	
	public void display() {
			System.out.println(s[top]+"Position:"+top);
	}
	
	
}
class pushThread extends Thread{
	StackClass s;
	int n;
	pushThread(StackClass s,int n){
		this.s=s;
		this.n=n;
	}
	
	public void run() {
		try {
			s.push(n);
		}catch(Exception ie) {
			ie.printStackTrace();
		}
		
	}
}

class popThread extends Thread{
	StackClass s;
	popThread(StackClass s){
		this.s=s;
	}
	
	public void run() {
		try {
			s.pop();
		}catch(Exception ie) {
			ie.printStackTrace();
		}
		
	}
}

class peekThread extends Thread{
	StackClass s;
	peekThread(StackClass s){
		this.s=s;
	}
	
	public void run() {
		try {
			s.display();
		}catch(Exception ie) {
			ie.printStackTrace();
		}
		
	}
}
public class StackThread {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		StackClass s= new StackClass(10);
		for(;;) {
			System.out.printf("ENTER YOUR CHOICE:\n1-PUSH\n2-POP\n3-DISPLAY\n4-EXIT\n");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("ENTER ELEMENT TO BE PUSHED:");
			       int ele=sc.nextInt();
			       pushThread t1=new pushThread(s,ele);
			       t1.start();
			       break;
			case 2:popThread t2=new popThread(s);
				   t2.start();
			        break;
			case 3:peekThread t3=new peekThread(s);
				   t3.start();
			       break;
			case 4:System.out.println("THANKYOU!!");
			       System.exit(0);
			default:System.out.println("INVALID CHOICE");
			}
		}

	}

}
