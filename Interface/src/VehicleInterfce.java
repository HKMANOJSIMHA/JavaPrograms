/*
 * there is vehice interface having methods like :
 * changegear(),speedup(),applybreaks()
 * implement this interface using a bike class and print the states of the vechile at the current instance
 */

interface vehicle{
	void changeGear(int newGear);
	void speedUp(int ispeed);
	void applyBreak(int dSpeed);
}
class bike implements vehicle{
	int gear,speed;
	public void changeGear(int gear) {
		this.gear=gear;
	}
	public void speedUp(int ispeed) {
		speed+=ispeed;
		if(speed==100)
		changeGear(4);
	}
	public void applyBreak(int dSpeed) {
		speed-=dSpeed;
		if(speed==20)
		changeGear(2);
	}
	void display() {
		System.out.println("CURRENT GEAR:"+gear);
		System.out.println("CURRENT SPEED:"+speed);
	}
}
public class VehicleInterfce {

	public static void main(String[] args) {
		bike b1=new bike();
		b1.speedUp(100);
		b1.display();
        b1.applyBreak(80);
        b1.display();
	}

}
