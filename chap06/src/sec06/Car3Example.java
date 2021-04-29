package sec06;

public class Car3Example {

	public static void main(String[] args) {
		Car3 myCar = new Car3();
		myCar.keyTurnOn();
		myCar.run();
		System.out.println("현재 속도: "+ myCar.getSpeed()+"km/h");
	}

}
