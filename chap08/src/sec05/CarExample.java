package sec05;

public class CarExample {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.run();
		
		System.out.println();
		
		car.tires[0] = new KumhoTire();
		car.tires[1] = new KumhoTire();

		car.run();
		
		

	}

}
