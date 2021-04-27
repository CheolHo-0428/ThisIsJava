package sec03;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;	//int <- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;	//intValue <- charValue
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;	//longValue <- intValue
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//doubleValue <- intValue
		System.out.println(doubleValue);

	}

}
