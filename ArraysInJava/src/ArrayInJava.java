
public class ArrayInJava {

	public static void main(String[] args) {
		//Declaration and instation of array
		int iArr[]=new int [5];
		System.out.println("SIZE OF THE ARRAY IS:"+iArr.length);
        //System.out.println(iArr.getClass());//gives the rapper class //RAPPER CLASS: IT REFERS TO CLASS OF DATATYPES TO MAKE IT OBJECT ORIENTED
        //System.out.println(iArr.getClass().getSuperclass());//shows the owner of all classes
		
		//initialization of arrays
		iArr[0]=1;
		iArr[1]=2;
		iArr[2]=3;
		iArr[3]=4;
		iArr[4]=5;
		
		System.out.println("ELEMENTS OF ARRAY ARE:");
		//TRAVERSING AN ARRAY
		for(int i=0;i<iArr.length;i++)  //USE OF INBUILT VARIABLE LENGTH 
		System.out.println(iArr[i]);
		
		//IMP POINTS:
		// -> AN INTEGER ARRAY HAS 0 AS DEFAULT VALUE
		// ->A FLOATING POINT ARRAY HAS 0.0 AS DEFAULT VALUE
	}

}
	
