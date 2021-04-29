package sec06;

public class CarExample {

	public static void main(String[] args) {
		Car hyundai = new Car("현대자동차", "그랜저", "블랙", 180, 80);
		hyundai.run();
		hyundai.setSpeed(100);
		System.out.println("수정된 속도: " + hyundai.getSpeed());
		
		System.out.println("---------------------------");
		
		Car kia = new Car("기아자동차", "쏘렌토", "화이트", 200, 90);
		kia.run();
		kia.setSpeed(30);
		System.out.println("수정된 속도: " + kia.getSpeed());
		
	}
}
