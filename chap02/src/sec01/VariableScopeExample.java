package sec01;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		int v2;
		
		if(v1 > 10) {
			v2 = v1 - 10;
			int v3 = v2 + v1 + 5; 
			System.out.println(v3);	// 정상 출력
		}
		
		// int v5 = v2 + v1 + 5; //컴파일 에러
	}

}
