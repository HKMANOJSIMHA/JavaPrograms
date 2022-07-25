package PracticeProgram1;
class manoj{
	private String name;
	private long Adharno;
	private String Qualification;
	private String State;
	
	//parameterized constructor
	manoj(String name, long Adharno,String Qualification,String State){
		this.name=name;
		this.Adharno=Adharno;
		this.Qualification=Qualification;
		this.State=State;
	}
	void displayMyDetails() {
		System.out.println("NAME:"+name);
		System.out.println("ADHAR NUMBER:"+Adharno);
		System.out.println("QUALIFICATION:"+Qualification);
		System.out.println("STATE:"+State);
	}
}
