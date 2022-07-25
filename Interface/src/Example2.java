/*
 * interface polygon contains following methods:
 * int  getarea(int,int)
 * write two class rect & square that implement polygon and print respective area
 */
interface polygon{
	int getArea(int l,int b);
}
class rect implements polygon{
	public int getArea(int l,int b) {
		return l*b;
	}
}
class square implements polygon{
	public int getArea(int l,int b){
		return l*b;
	}
}
public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         rect r=new rect();
         square s=new square();
         System.out.println("AREA OF SQUARE IS:"+s.getArea(10,10));
         System.out.println("AREA OF RECTANGLE IS:"+r.getArea(10,20));
	}

}
