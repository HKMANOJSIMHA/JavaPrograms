/*create an interface named integerstack which has methods:
 * void push(int)
 * int pop()
 * implement this interface for both fixed stack
 */
import java.util.Scanner;
interface integerStack{
	void push(int n);
	void pop();
	void display();
}
class stStack implements integerStack{
	private int s[];
	private int top;
	stStack(int size){
		s=new int[size];
		top=-1;
	}
	
	public void push(int ele) {
		if(top==s.length-1)
			System.out.println("STACK OVERFLOW");
		else
			s[++top]=ele;
	}
	public void pop() {
		if(top<0)
			System.out.println("STACK UNDERFLOW");
		else
			System.out.println("ITEM POPPED IS:"+s[top--]);
	}
	public void display() {
		for(int i=0;i<=top;i++) 
			System.out.println(s[i]);
	}
}
public class Example3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		integerStack iStack;
		stStack fs=new stStack(5);
		iStack=fs;
		for(;;) {
			System.out.printf("ENTER YOUR CHOICE:\n1-PUSH\n2-POP\n3-DISPLAY\n4-EXIT\n");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("ENTER ELEMENT TO BE PUSHED:");
			       int ele=sc.nextInt();
			       iStack.push(ele);
			       break;
			case 2: iStack.pop();
			        break;
			case 3:iStack.display();
			       break;
			case 4:System.out.println("THANKYOU!!");
			       System.exit(0);
			default:System.out.println("INVALID CHOICE");
			}
		}
		
	}

}

