package Unit1;
import java.util.Scanner;

abstract class computeAverage{
	abstract void Average(int marks[]); 
}

class student extends computeAverage{
	void Average(int marks[]){
		double sum=0;
		for(int i=0;i<marks.length;i++)
			sum=sum+marks[i];
		System.out.println("Average of "+marks.length+" subjects is:"+(sum/marks.length));
		}
}
public class unit1b {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter marks for "+n+" subjects:");
		for(int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		student sObj=new student();
		sObj.Average(marks);
	}

}
