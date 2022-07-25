package Unit2;

import java.util.Scanner;

class ArrayOp{
	double computeSum(int a[]) {
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum/a.length;
	}
	void sort(int a[]) {
		int temp;
		System.out.println("Array before sorting is:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Array after sorting is:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
}

public class unit2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter "+n+" elements into array:");
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		
		ArrayOp aopObj=new ArrayOp();
		System.out.println("Average of the array of "+n+" elements is:"+aopObj.computeSum(array));
		aopObj.sort(array);
	}

}
