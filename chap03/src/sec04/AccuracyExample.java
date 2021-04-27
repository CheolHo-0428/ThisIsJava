package sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		
		System.out.println("사과 한개에서 ");
		System.out.println(number + "조각을 빼면,");
		System.out.println(result + "조각이 남습니다.");
	}

}
