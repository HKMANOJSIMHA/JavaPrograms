
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class streams {
	 public static void main(String[] args) {
	 FileInputStream Fin=null;
	 FileOutputStream Fout=null;
	 try {
		 Fin=new FileInputStream("C:\\2SD19CS037\\Abstraction\\src\\input.txt");
		 Fout=new FileOutputStream("C:\\2SD19CS037\\Abstraction\\src\\output.txt");
		 
		 int ch;
		 int vowels=0;
		 {
		 while((ch=Fin.read())!=-1)
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				 vowels++;
		 
	         Fout.write(ch);
			Fout.write(vowels);
		 }
		 }catch (Exception e) {
		 System.out.println("error wt file op" +e);
	 }	 
 	 }
}
