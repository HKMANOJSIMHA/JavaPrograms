
import StringOperations.ReadString;
import java.util.Scanner;

class vowel extends Exception{
	
	void disply() {
		System.out.println("Exception in string.All vowels found");
	}
	
}
class StringOpService implements ReadString{
	 Scanner sc=new Scanner(System.in);
	int i;
	public void EvaluateStrings(){
		
		for(;;) {
			System.out.println("Enter your choice:");
			System.out.println("1:Reverse\n2:CaseConversion\n3:VowelCheck\n4-CheckException\n5-Exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:  System.out.println("Enter the string");
			         String s1=sc.next();
					char[] reverse = s1.toCharArray();
					System.out.println("Reversed string is");
		        		for (i = reverse.length - 1; i >= 0; i--)
		        				System.out.print(reverse[i]);
		        		System.out.println();
		        		break;
		        
			case 2:  System.out.println("Enter the string");
					 s1=sc.next();
					StringBuffer strBuffer = new StringBuffer(s1.length());
					  System.out.println("Before conversion:"+s1);
		        	for( i=0;i<s1.length();i++) {
		        		char c=s1.charAt(i);
		        	if(Character.isUpperCase(c))
		        		c=Character.toLowerCase(c);
		        	if(Character.isLowerCase(c))
		        		c=Character.toUpperCase(c);
		        	 strBuffer.append(c);
		        }
		        System.out.println("After conversion:"+strBuffer);
		        break;
		        
			case 3:   System.out.println("Enter the string");
			 		 s1=sc.next();
					for( i=0;i<s1.length();i++) {
		    	   int r1=Character.compare(s1.charAt(i), 'a');
		           int r2=Character.compare(s1.charAt(i), 'e');
		           int r3=Character.compare(s1.charAt(i), 'i');
		           int r4=Character.compare(s1.charAt(i), 'o');
		           int r5=Character.compare(s1.charAt(i), 'u');
		           
		           if(r1==0||r2==0||r3==0||r4==0||r5==0) {
		        	 	System.out.println("First vowel found is:"+s1.charAt(i));
		        	 	break;
		           }
		           
		       }
		       if(i==s1.length())
		    	   System.out.println("Vowel not found");
		       break;
		       
			case 4: System.out.println("Enter the string");
			 		s1=sc.next();
					int count=0;
				   for( i=0;i<s1.length();i++) {
		    	   int r1=Character.compare(s1.charAt(i), 'a');
		           int r2=Character.compare(s1.charAt(i), 'e');
		           int r3=Character.compare(s1.charAt(i), 'i');
		           int r4=Character.compare(s1.charAt(i), 'o');
		           int r5=Character.compare(s1.charAt(i), 'u');
		           
		           if(r1==0||r2==0||r3==0||r4==0||r5==0) {
		        	    count++;
		           }
		           try {
		        	   if(count==s1.length()) {
		        		   vowel v=new vowel();
		        		   throw v;
		        	   }
		           }
		           catch(vowel v) {
		        	   v.disply();
		           }
		           
				   }
				
				
			case 5:System.exit(0);
		    default:System.out.println("Invalid choice");
		            break;
			}
	       
	        	
		}
		}
}
public class TestProg {

	public static void main(String[] args) {
		 StringOpService s1=new  StringOpService();
		 s1.EvaluateStrings();

	}

}
