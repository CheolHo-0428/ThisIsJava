package sec04;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		int charCode = 'A';
		
		if(charCode>=65 && charCode<=122) {
			System.out.println("대문자이군요");
		}
		
		if(charCode>=97 && charCode<=122) {
			System.out.println("소문자이군요");
		}
		
		
		
		int value = 6;
		if(value%2==0 || value%3==0) {
			System.out.println("2또는 3의 배수 이군요");
		}
		

	}

}
