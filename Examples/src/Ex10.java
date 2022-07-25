/*There are two threads thread1 and thread2 where thread1 tries to print all the vowels available in a given
 * string and also print the count of it thread2 searches and prints all the special characters in the given string
 * this need to be implemented without synchronization and with synchronization
 */
class vowel extends Thread{
	String s1;

	public vowel(String s1) {
		this.s1 = s1;
	}
	
	public void  run() {
		int count=0;
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			if(Character.toLowerCase(ch)=='a'||Character.toLowerCase(ch)=='e'||Character.toLowerCase(ch)=='i'||Character.toLowerCase(ch)=='o'||Character.toLowerCase(ch)=='u') {
				System.out.println(ch);
				count++;
			}
		}
		System.out.println("Total number of vowels present are:"+count);
	}
}
class special extends Thread{
	String s1;
	
	public special(String s1) {
		this.s1 = s1;
	}
}
public class Ex10 {

	public static void main(String[] args) {
		vowel v1=new vowel("Manojmaddy");
		special s1=new special("@manoj#123&**");
		v1.start();
		s1.start();

	}

}
