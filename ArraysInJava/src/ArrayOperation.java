import java.util.Scanner;
class sumOfArray{
	int findsum(int iArr[]) {
		int sum=0;
		for(int i=0;i<iArr.length;i++) {
			sum+=iArr[i];
		}
		return sum;
	}
	
}
public class ArrayOperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iArr[]=new int [10];
		System.out.println("ENTER THE SIZE OF ARRAY");
		int n=sc.nextInt();
		System.out.println("ENTER"+" "+n+" "+"ELEMENTS INTO ARRAY");
		 for(int i=0; i<n; i++) {
			 iArr[i]=sc.nextInt();
		 }
		 sumOfArray obj=new sumOfArray();
		System.out.println("THE SUM OF"+" "+n+" "+"ELEMENTS OF ARRAY IS:"+obj.findsum(iArr));
	}

}
