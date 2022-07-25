/*write a java program to read a string from the user containing only alpha bets if the user enters any other characte 
 * other than alphabet throw the error message and print count the vowels and consonants till that time
 */
import java.util.Scanner;
class alphaCheck extends Exception{
	char ch;
	public alphaCheck(char ch) {
		this.ch = ch;
	}
	public String toString() {
		return "Oops!! "+ch+" is not an alphabet";
	}
}

class alphabet{
	Scanner sc=new Scanner(System.in);
	alphabet(){
		int vowel=0,cons=0;
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		try {
			for(int i=0;i<str.length();i++) {
				if(Character.isAlphabetic(str.charAt(i)) ) {
					char ch=str.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
						vowel++;
					else
						cons++;
				}
				else {
					throw new alphaCheck(str.charAt(i));
				}
			}

		}catch(alphaCheck a) {
			System.out.println(a.toString());
		}finally {
			System.out.println("Number of vowels :"+vowel);
			System.out.println("Number of consonants :"+cons);
		}
	}
}
public class Ex5 {

	public static void main(String[] args) {
		alphabet a=new alphabet();
	}

}
