import java.util.Scanner;
class arrayopn{
	int a[][];
	int row,column;
	arrayopn(int b[][],int m,int n){
		a=new int[m][n];
		row=m;
		column=n;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=b[i][j];
			}
		}
	}
	int sum() {
		int s=0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				s+=a[i][j];
			}
		}
		return s;
	}
}
public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ORDER OF THE ARRAY:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int arr[][]=new int[m][n];
		System.out.println("ENTER "+m*n+" ELEMENTS INTO ARRAY:");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		arrayopn obj=new arrayopn(arr,m,n);
		System.out.println("THE SUM OF 2D ARRAY IS:"+obj.sum());
	}

}
