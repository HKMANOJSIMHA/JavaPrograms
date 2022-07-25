import java.util.Scanner;
class A{
	void printHello() {
		System.out.print("HELLO ");
	}
}
class B extends A{
	void printName(String name) {
		System.out.println(name);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		B b=new B();
	    System.out.print("ENTER YOUR NAME:");
	    String name=sc.nextLine();
	    b.printHello();
	    b.printName(name);

	}

}
