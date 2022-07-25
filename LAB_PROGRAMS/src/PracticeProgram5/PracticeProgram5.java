package PracticeProgram5;

import java.util.Scanner;

public class PracticeProgram5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE NUMBER OF SUBJECTS:");
		int size=sc.nextInt();
		int marks[]=new int[size];
		
		for(int i=0;i<marks.length;i++) {
			System.out.print("ENTER MARKS OBTAINED IN SUBJECT "+(i+1)+":");
			marks[i]=sc.nextInt();
		}
		
		Grades grade_obj=new Grades(marks);
		grade_obj.computeGrades();
		
      }
}
