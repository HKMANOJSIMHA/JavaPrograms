class c1{
	void print() {
		System.out.println("HII I AM C1");
	}
}
class c2 extends c1{
	@Override  //shows us error at compile time if we do any mistake regarding overriding
	void print() {
		System.out.println("HII I AM C2");
	}
}
public class methodOverriding {

	public static void main(String[] args) {
		c2 C2=new c2();
		C2.print();
		}

}
