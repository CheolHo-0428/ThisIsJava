package sec06;

public class Car1 {
	//필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//생성자
	public Car1() {
		
	}
	
	public Car1(String model) {
		this.model = model;
	}
	
	public Car1(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public Car1(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
