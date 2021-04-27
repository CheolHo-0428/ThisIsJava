package sec04;

public class OverFlowExample {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z); // 오버플로우가 일어나 잘못된 값이 출력된다
		
		
		long L = (long)x * y;
		System.out.println(L); // 올바른 값이 출력된다.
	}

}
