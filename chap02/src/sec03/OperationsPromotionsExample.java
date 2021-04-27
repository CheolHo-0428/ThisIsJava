package sec03;

public class OperationsPromotionsExample {

	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		
		// byte byteValue = byteValue1 + byteValue2; 컴파일 에러
		int intValue = byteValue1 + byteValue2;
		System.out.println(intValue);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		
		// char charValue3 = charValue1 + charValue2; 컴파일 에러
		intValue = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue);
		System.out.println("출력문자=" + (char)intValue);
		
		intValue = 10;
		int intValue1 = intValue/4;
		System.out.println(intValue);
		
		intValue = 10;
		double doubleValue = intValue / 4.0;
		System.out.println(doubleValue);
	}

}
