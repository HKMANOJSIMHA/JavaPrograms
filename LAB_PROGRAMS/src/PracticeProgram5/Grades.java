package PracticeProgram5;

class Grades{
	//instance variable
	int marks[];
	//parameterized constructors
	Grades(int m[]){
		marks=new int[m.length];
		for(int i=0;i<marks.length;i++)
			marks[i]=m[i];
	}
	void computeGrades() {
		System.out.println("THE GRADES OF ALL THE SUBJECTS ARE:");
		for(int i=0;i<marks.length;i++) {
			if(marks[i]>=90 && marks[i]<=100)
				System.out.println("SUBJECT "+(i+1)+": S GRADE");
			else if(marks[i]>=80 && marks[i]<90)
				System.out.println("SUBJECT "+(i+1)+": A GRADE");
			else if(marks[i]>=70 && marks[i]<80)
				System.out.println("SUBJECT "+(i+1)+": B GRADE");
			else if(marks[i]>=60 && marks[i]<70)
				System.out.println("SUBJECT "+(i+1)+": C GRADE");
			else if(marks[i]>=50 && marks[i]<60)
				System.out.println("SUBJECT "+(i+1)+": D GRADE");
			else if(marks[i]>=40 && marks[i]<50)
				System.out.println("SUBJECT "+(i+1)+": E GRADE");
			else if(marks[i]>=0 && marks[i]<40)
				System.out.println("SUBJECT "+(i+1)+": F GRADE");
			else
				System.out.println("SUBJECT "+(i+1)+": INVALID MARKS");
			
		}
	}
}