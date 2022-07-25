package Unit2;

import java.util.Scanner;

class findSmallest{
	void checkSmallest(int a[],int k) {
		int temp;
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The first "+k+" smallest elements are:");
		for(int i=0;i<k;i++)
			System.out.print(a[i]+" ");
	}
}

public class unit2h {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		
		int array[]=new int[n];
		System.out.println("Enter "+n+" elements into array:");
		for(int i=0;i<n;i++)
			array[i]=sc.nextInt();
		
		System.out.println("Enter the value of k:");
		int k=sc.nextInt();
		
		findSmallest fObj=new findSmallest();
		fObj.checkSmallest(array, k);

	}

}
