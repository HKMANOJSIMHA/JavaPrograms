import java.util.Scanner;
class eligiblity extends Exception{
	int age;

	public eligiblity(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "You need to be "+(18-age)+"more years older to be eligible for voting";
	}
	
}
class ageCheck{
	Scanner sc=new Scanner(System.in);
	ageCheck(){
		System.out.println("Enter your age :");
		int age=sc.nextInt();
		try {
			if(age<18) {
				throw new eligiblity(age);
			}
			
		}catch(eligiblity e) {
			System.out.println(e.toString());
			return;
		}
		System.out.println("You can vote!");
	}
}
public class Ex4 {

	public static void main(String[] args) {
		ageCheck e=new ageCheck();
	}

}
