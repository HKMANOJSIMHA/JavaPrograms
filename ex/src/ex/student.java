package ex;

import java.util.Scanner;
class details{
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

void displayRecord()
{
System.out.println(Name+"\t"+USN+"\t"+branch+"\t"+cgpa);
}
}
public class student
{
	public static void main(String args[])
{ 
details s[]=new details [100]; 
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of students");
int n=sc.nextInt();
for(int i=0;i<n;i++)  
     s[i]=new details();
for(int j=0;j<n;j++)
{       System.out.println("enter the usn,name,branch,cgpa");
        String USN=sc.next();    
        String Name=sc.next();    
       String branch=sc.next();     
        int cgpa=sc.nextInt();
   s[j].insertRecord(USN,Name,branch,cgpa);

}
System.out.println("Name\tUSN\tbranch\tCGPA");
for( int m=0;m<n;m++)
{
 s[m].displayRecord();
}

}
}
