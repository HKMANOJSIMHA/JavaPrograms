package TermWork1;

class person{
	private String name;
	private String address;
	
	public person(String name,String address) {
		this.name=name;
		this.address=address;
	}
	 
	public String getName() {
		return name;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getAddress() {
		return address;
	}
	public String toString() {
		return "Person[ Name="+name+" Address="+address+" ]";
	}
}

