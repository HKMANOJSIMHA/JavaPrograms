package Unit1;

class stringOperation{
	void strop(String s1,String s2) {}
}

class findLength extends stringOperation{
	void strop(String s1,String s2) {
		int l1=s1.length();
		int l2=s2.length();
		System.out.println("Length of string "+s1+" is :"+l1);
		System.out.println("Length of string "+s2+" is :"+l2);
	}
}
class compareStrings extends stringOperation{
	void strop(String s1,String s2) {
		boolean result=s1.equals(s2);
		if(result==true) {
			System.out.println("Strings are equal");
		}
		else
			System.out.println("Strings are not equal");
	}
}
public class unit1e {

	public static void main(String[] args) {
		String s1=args[0];
		String s2=args[1];
		stringOperation sopObj;
		sopObj=new findLength();
		sopObj.strop(s1,s2);
		sopObj=new compareStrings();
		sopObj.strop(s1,s2);

	}

}
