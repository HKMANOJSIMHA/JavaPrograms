package TermWork1;
class Student extends person{
	
	private String Program;
	private int year;
	private double fee;
	
	public Student(String name,String address,String Program,int year,double fee) {
		super(name,address);
		this.Program=Program;
		this.year=year;
		this.fee=fee;
	}
	public void setProgram(String Program) {
		this.Program=Program;
	}
	public String getProgram() {
		return Program;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	public void setFee(double fee) {
		this.fee=fee;
	}
	public double getFee() {
		return fee;
	}
	public String toString() {
		return "Student["+super.toString()+", Program:"+Program+" Year:"+year+" Fee:"+fee+"]";
	}
}
