import java.util.Scanner;
class one{
	void printHello() {
		System.out.print("HELLO ");
	}
}
class two extends one{
	void printName(String name) {
		System.out.print(name);
	}
}
class three extends two{
	void printMessage() {
		System.out.print(" WATSUPP!!");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		three t=new three();
		System.out.println("ENTER YOUR NAME:");
		String name=sc.nextLine();
		t.printHello();
		t.printName(name);
		t.printMessage();

	}

}
