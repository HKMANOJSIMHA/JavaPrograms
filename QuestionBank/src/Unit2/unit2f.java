package Unit2;
class StringOp{
	void compareStrings(String s1,String s2) {
		if(s1.equals(s2))
			System.out.println("Two strings are equal");
		else
			System.out.println("Two strings are not equal");
	}
	
	void convertCases(String s1,String s2) {
		System.out.println(s1+" After conversion to uppercase is:"+s1.toUpperCase());
		System.out.println(s2+" After conversion to lowercase is:"+s2.toLowerCase());
	}
	
	void concateStrings(String s1,String s2) {
		String concat=s1.concat(s2);
		System.out.println("The concatenated string is:"+concat);
	}
	
	void findOccurence(String s1,String s2) {
		String concat=s1.concat(s2);
		for(int i=0;i<concat.length();i++) {
			if(concat.charAt(i)=='a') {
				System.out.println("The first occurence of a is at index:"+i);
				break;
			}
				
		}
	}
	
	void computeLength(String s1,String s2) {
		String concat=s1.concat(s2);
		int length=concat.length();
		System.out.println("Length of concatenated string is:"+length);
	}
}

public class unit2f {

	public static void main(String[] args) {
		String s1=args[0];
		String s2=args[1];
		
		StringOp obj=new StringOp();
		obj.compareStrings(s1, s2);
		obj.convertCases(s1, s2);
		obj.concateStrings(s1, s2);
		obj.findOccurence(s1, s2);
		obj.computeLength(s1, s2);

	}

}
