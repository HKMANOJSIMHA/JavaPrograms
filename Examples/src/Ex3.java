/*write a java program to cteate a exception class whenever the temprature of city crosses the limit 0f 45degree*/
import java.util.Scanner;
class tempCheck extends Exception{
	float temp;

	public tempCheck(float temp) {
		this.temp = temp;
	}
	
	public String toString() {
		return temp+" Is too high temprature";
	}
}
class temprature{
	Scanner sc=new Scanner(System.in);
	temprature(){
		System.out.println("Enter the temprature of your city:");
		float temp=sc.nextFloat();
		try {
			if(temp>45) {
				throw new tempCheck(temp);
			}
		}catch(tempCheck t1) {
			System.out.println(t1.toString());
			return;
		}
		System.out.println("Your city temprature is:"+temp);
	}
}
public class Ex3 {

	public static void main(String[] args) {
		temprature t1=new temprature();

	}

}
