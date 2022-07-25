package Unit3;

interface vehicle{
	void changeGear(int newGear);
	void speedUp(int ispeed);
	void applyBreak(int dSpeed);
}

class car implements vehicle{
	int gear,speed;
	car(){
		gear=speed=0;
	}
	public void changeGear(int gear) {
		this.gear=gear;
		System.out.println("Gear changed to:"+this.gear);
	}
	public void speedUp(int ispeed) {
		speed+=ispeed;
		System.out.println();
		System.out.println("Speeding up.....");
		System.out.println("Current speed is:"+speed);
		if(speed>=100)
			changeGear(4);
	}
	public void applyBreak(int dSpeed) {
		speed-=dSpeed;
		System.out.println();
		System.out.println("Applying brakes.....");
		System.out.println("Current speed is:"+speed);
		if(speed<=20)
			changeGear(2);
	}
}

public class unit3d {

	public static void main(String[] args) {
		car c1=new car();
		System.out.println("Initial gear and speed for car 1 are 0");
		c1.changeGear(2);
		c1.speedUp(100);
		c1.applyBreak(80);
		System.out.println();
		car c2=new car();
		System.out.println("Initial gear and speed for car 2 are 0");
		c2.changeGear(3);
		c2.speedUp(80);
		c2.applyBreak(40);

	}

}
