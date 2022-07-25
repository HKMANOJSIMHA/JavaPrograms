import java.util.Scanner;
abstract class book{
	String title;
	abstract void setTitle(String s);
	String getTitle() {
		return title;
	}
}
class Title extends book{
	void setTitle(String t) {
		title=t;
	}
}
public class BookEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE TITLE OF THE BOOK:");
		String title=sc.nextLine();
		Title t=new Title();
		t.setTitle(title);
		System.out.println("YOUR BOOK'S TITLE IS:"+t.getTitle());

	}

}
