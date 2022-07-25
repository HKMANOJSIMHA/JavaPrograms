
import java.util.Scanner;
class computecie{
	int std[];
	computecie(int s[]){
		std=new int[s.length];
		for(int i=0;i<s.length;i++) {
			std[i]=s[i];
		}
	}
	int highest() {
		int high=std[0];
		for(int i=0;i<std.length;i++) {
			if(std[i]>high)
			high=std[i];
		}
		return high;
	}
	double average() {
		int s=0;
		for(int i=0;i<std.length;i++) {
			s+=std[i];
		}
		return s/std.length;
	}
}

public class CalcAverageHighestCie {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE STRENGTH OF THE CLASS:");
		int s=sc.nextInt();
		int student[]=new int[s];
		
		System.out.println("ENTER THE MARKS OF "+s+" STUDENTS:");
		for(int i=0;i<s;i++) {
			student[i]=sc.nextInt();
		}
		
		computecie obj=new computecie(student);
		System.out.println("HIGHEST CIE IS:"+obj.highest());
		System.out.println("AVERAGE CIE IS:"+obj.average());
		

	}

}
