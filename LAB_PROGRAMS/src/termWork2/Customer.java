package termWork2;

public class Customer {
	String name;
	boolean member;
	String memberType;
	Customer(){
		name=null;
		member=false;
		memberType=null;
	}
	
	public Customer(String name) {
		this.name=name;
	}
	void setMember(boolean member) {
		this.member=member;
	}
	public boolean isMember() {
		return member;
	}
	public void setmemberType(String memberType ) {
		this.memberType=memberType;
	}
	public String getmemberType() {
		return memberType;
	}
	public String toString() {
		if(member==false)
			return "NAME OF CUSTOMER: "+name
				  +"	IS HE A MEMBER: NO";
		else
			return "NAME OF CUSTOMER: "+name
					+"	IS HE A MEMBER: YES"
					+"	MEMBER TYPE: "+memberType.toUpperCase();
	}

}
