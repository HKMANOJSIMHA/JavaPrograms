/*Write a java program to implement the following :
 * There is a class named Animal which has a member method void walk() that prints i can walk
 * There is another class by name Bird which has member method void fly that prints i can fly
 * since bird is an animal bird can also walk implement main function in such a way that for any 
   bird taken it should print both the messages*/
class Animal{
	void walk() {
		System.out.println("I CAN WALK");
	}
}
class Bird extends Animal{
	void Fly(){
	    System.out.print("I CAN FLY ");
	}
}
public class Example2 {

	public static void main(String[] args) {
		Bird b=new Bird();
		b.Fly();
		b.walk();
		
	}

}
