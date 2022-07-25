package Unit2;
import java.util.Scanner;

class ArrayOperations{
	int computeSum(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}
	
	int computeLargest(int a[]) {
		int large=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>=large)
				large=a[i];
		}
		return large;
	}
	
	int computeSmallest(int a[]) {
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<=small)
				small=a[i];
		}
		return small;
	}
}
public class unit2c {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter "+n+" elements into array:");
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		
		ArrayOperations aopObj=new ArrayOperations();
		System.out.println("Sum of the array of "+n+" elements is:"+aopObj.computeSum(array));
		System.out.println("Largest of the array of "+n+" elements is:"+aopObj.computeLargest(array));
		System.out.println("Smallest of the array of "+n+" elements is:"+aopObj.computeSmallest(array));
	}

}
