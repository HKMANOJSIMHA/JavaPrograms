package Unit2;

import java.util.Scanner;

class game{
	Scanner sc=new Scanner(System.in);
	String input;
	void computeAnswer() {
		System.out.println("Which is the Capital city of India?");
		for(int i=1;i<=3;i++) {
			input=sc.next();
			if(input.equals("NewDelhi")||input.equals("Delhi")) {
				System.out.println("Congratulation!!");
				System.exit(0);
			}
			else {
				if(3-i!=0) {
					System.out.println("U are left with "+(3-i)+" Chances");
					System.out.println("Which is the Capital city of India?");
				}
					
			}
				
		}
		System.out.println();
		System.out.println("Sry you have given wrong answer in all attempts");
		System.out.println("The correct answer is Delhi or New Delhi");
	}
}

public class unit2e {

	public static void main(String[] args) {
		game gObj=new game();
		gObj.computeAnswer();

	}

}
