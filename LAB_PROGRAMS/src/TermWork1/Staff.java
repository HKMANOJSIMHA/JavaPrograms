package TermWork1;

class Staff extends person{
	private String School;
	private double pay;
	
	public Staff(String name,String address,String School,double pay) {
		super(name,address);
		this.School=School;
		this.pay=pay;
	}
	public void setSchool(String School) {
		this.School=School;
	}
	public String getSchool() {
		return School;
	}
	public void setPay(double pay) {
		this.pay=pay;
	}
	public double getPay() {
		return pay;
	}
	public String toString() {
		return "Staff["+super.toString()+",School:"+School+" Pay:"+pay+"]";
	}
}
