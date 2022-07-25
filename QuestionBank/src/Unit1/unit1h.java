package Unit1;
class Engine 
{
    public void work(){
          System.out.println("Engine of car has been started ");
      }
      
}
final class Car {
    private final Engine engine; // Composition
      
    Car(Engine engine){
        this.engine = engine;
    }
     
    public void move(){
    	engine.work();
        System.out.println("Car is moving ");
    }
}

public class unit1h {

	public static void main(String[] args) {
		
		Engine engine = new Engine();
		
		Car car = new Car(engine);
	    car.move();

	}

}
