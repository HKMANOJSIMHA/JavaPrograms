import java.util.Scanner;
class Arrayop{
	int evenArray[];
	int oddArray[];
	void computeEven(int arr[]) {
		evenArray=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evenArray[j]=arr[i];
				j++;
			}
				
		}
		System.out.println("Total even elements are:"+j+"They are:");
		for(int k=0;k<j;k++) {
			System.out.println(evenArray[k]);
		}
	}
	void computeOdd(int arr[]) {
		oddArray=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				oddArray[j]=arr[i];
				j++;
			}
				
		}
		System.out.println("Total odd elements are:"+j+"They are:");
		for(int k=0;k<j;k++) {
			System.out.println(oddArray[k]);
		}
	}

	

}
public class ArraysUsingConstructors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF ARRAY:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("ENTER"+" "+size+" "+"ELEMENTS INTO ARRAY:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Arrayop Aobj=new Arrayop();
	    Aobj.computeEven(arr);
	    Aobj.computeOdd(arr);

	}

}
