import java.util.Scanner; 
 class student
 {
            String USN;
            String Name;
            String branch;
            int cgpa;
void insertRecord(String reg,String name, String brnch,int cg) {
USN=reg;
Name=name;
branch=brnch; 
cgpa=cg;
}

void displayRecord(String input)
{System.out.println("Name\tUSN\tbranch\tcgpa");
System.out.println(Name+"\t"+USN+"\t"+branch+"\t"+cgpa);
}

public static void main(String args[])
{ 

Scanner sc=new Scanner(System.in);
System.out.println("enter the number of students");
int n=sc.nextInt();
student s[]=new student [n]; 
for(int i=0;i<n;i++)  
      s[i]=new student();
for(int j=0;j<n;j++)
{       System.out.println("enter the usn,name,branch,cgpa");
         String USN=sc.next();    
         String Name=sc.next();    
        String branch=sc.next();     
         int cgpa=sc.nextInt();
    s[j].insertRecord(USN,Name,branch,cgpa);

}
System.out.println("ENTER USN :");
String usn=sc.next();
for( int m=0;m<n;m++)
{
	if(s[m].USN==usn)
  s[m].displayRecord(usn);
}

}
}