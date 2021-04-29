package sec04;

public class SuperAirPlaneExample {

	public static void main(String[] args) {
		SuperAirplane p1 = new SuperAirplane();
		p1.takeOff();
		p1.fly();
		
		p1.flyMode = SuperAirplane.SUPERSONIC;
		p1.fly();
		
		p1.flyMode = SuperAirplane.NORMAL;
		p1.fly();
		
		p1.land();

	}

}
