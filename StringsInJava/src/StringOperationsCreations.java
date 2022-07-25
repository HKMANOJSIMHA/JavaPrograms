import java.util.Scanner;
public class StringOperationsCreations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="Welcome to";
		System.out.println("ENTER A STRING:");
		char ch[]=sc.next().toCharArray();
		String s2=new String(ch);
		String s3=new String("Programming");
		System.out.println(s1+" "+s2+" "+s3);
		String CatS=s1+" "+s2+" "+s3;
		System.out.println("LENGTH OF CONCATENATED STRING IS:"+CatS.length());
		System.out.println(CatS.toUpperCase());
		System.out.println(CatS.toLowerCase());
		System.out.println(CatS.indexOf('j'));
		System.out.println(s1.equals(s2));
	}

}
