package sec06;

public class Car {	
	//필드
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int speed;
	
	//생성자
	public Car(String company, String model, String color, int maxSpeed, int speed) {
		this.company=company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}
	
	//메소드
	public void run() {
		System.out.println("제작회사: " + company);
		System.out.println("모델명: " + model);
		System.out.println("색상: " + color);
		System.out.println("최고속도: " + maxSpeed);
		System.out.println("현재속도: " + speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	

}
