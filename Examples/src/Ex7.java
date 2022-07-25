import java.util.Scanner;

class equalEx extends Exception{
	String str1,str2;

	public equalEx(String str1, String str2) {
		this.str1 = str1;
		this.str2 = str2;
	}

	@Override
	public String toString() {
		return str1+" and "+str2+" are not equal";
	}
	
}
class compare{
	
	void compStrings(String str1,String str2) {
		try {
			if(str1.equalsIgnoreCase(str2)) {
				System.out.println("The converted uppercase string is:"+str1.toUpperCase());
				System.out.println("The length of the string is:"+str1.length());
			}
			else {
				throw new equalEx(str1,str2);
			}
		}catch(equalEx e1) {
			System.out.println(e1.toString());
		}
	}
}
public class Ex7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1=sc.next();
		System.out.println("Enter second string:");
		String str2=sc.next();
		compare c1=new compare();
		
		c1.compStrings(str1, str2);
		

	}

}
