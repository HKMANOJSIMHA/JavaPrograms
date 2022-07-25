import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class IntEX {

	public static void main(String[] args) {
		
		ArrayList<Integer>al1=new ArrayList<>();
		al1.add(11);
		al1.add(20);
		al1.add(33);
		al1.add(43);
		al1.add(50);
		
		Stream<Integer> s11=al1.stream();
		Optional<Integer> minVal=s11.min(Integer::compare);
		System.out.println("Min Value is:"+minVal.get());
		
		s11=al1.stream();
		Optional<Integer>MaxVal=s11.max(Integer::compare);
		System.out.println("Max Value:"+MaxVal.get());
		
		Stream<Integer> SortedSt=al1.stream().sorted();
		SortedSt.forEach((n)->System.out.print(n+""));
		System.out.println();
		
		Stream<Integer>sel=al1.stream().filter((n)->(n%2)==1).filter((n)->n>20);
		sel.forEach((n)->System.out.println(n+" "));
	}

}
