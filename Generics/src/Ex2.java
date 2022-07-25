import java.util.*;

/*Write a  Java Program using generics to find the sum and avearage of all the numerical 
 * supplied as a list of elements.
 * Note:a generic function that does the computation for a list of integers a list of double
 * values and a list of floating point numbers implement this using java generic wildcards*/
class genericWildcard{
	public static double sumAverage(List<? extends Number> l1) {
		double sum=0;
		for(Number n:l1) {
			sum=sum+n.doubleValue();
		}
		return sum;
		
	}
}
public class Ex2 {

	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<Integer>();
		for(int i=0;i<10;i++) {
			l1.add(i);
		}
		genericWildcard g1=new genericWildcard();
		System.out.println(g1.sumAverage(l1));
	}

}
