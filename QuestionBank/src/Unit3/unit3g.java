package Unit3;

final class A{
	void display() {
		System.out.println("This is class A and it is declared as final");
	}
}
//Error generated at this line because java complier won't allow final class for inheritance
class B extends A{
	void display() {
		System.out.println("This is class B and it cannot inherit final class");
	}
}
public class unit3g {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		
		a.display();
		b.display();

	}

}
