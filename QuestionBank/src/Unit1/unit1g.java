package Unit1;
import java.util.Scanner;

class computeSumAverage{
	void sumAvg(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of integers is:"+sum);
		System.out.println("Average of integers is:"+(sum/a.length));
	}
	void sumAvg(float a[]) {
		float sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println("Sum of floating point numbers is:"+sum);
		System.out.println("Average of floating point numbers:"+(sum/a.length));
	}
}

class computeInteger{
	int arr[];
	computeSumAverage comp;
	computeInteger(int a[],computeSumAverage c){
		arr=new int[a.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=a[i];
		}
			
		comp=c;
	}
	void displaySumAvg() {
		comp.sumAvg(arr);
	}
}

class computeFloat{
	float arr[];
	computeSumAverage comp;
	computeFloat(float a[],computeSumAverage c){
		arr=new float[a.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=a[i];
		}
			
		comp=c;
	}
	void displaySumAvg() {
		comp.sumAvg(arr);
	}
}
public class unit1g {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		computeSumAverage obj1=new computeSumAverage();
		System.out.println("Enter the size of integer array:");
		int intn=sc.nextInt();
		int iArr[]=new int[intn];
		System.out.println("Enter "+intn+" elements into array:");
		for(int i=0;i<intn;i++)
			iArr[i]=sc.nextInt();
		computeInteger intObj=new computeInteger(iArr,obj1);
		intObj.displaySumAvg();

		System.out.println("Enter the size of float array:");
		int floatn=sc.nextInt();
		float fArr[]=new float[floatn];
		System.out.println("Enter "+floatn+" elements into array:");
		for(int i=0;i<floatn;i++)
			fArr[i]=sc.nextFloat();
		computeFloat floatObj=new computeFloat(fArr,obj1);
		floatObj.displaySumAvg();
	}

}
