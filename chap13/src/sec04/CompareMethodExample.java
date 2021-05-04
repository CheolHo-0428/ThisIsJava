package sec04;

public class CompareMethodExample {

	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<Integer, String>(1, "사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과");
		boolean result1 = Util1.<Integer, String>compare(p1, p2);
		
		if(result1) {
			System.out.println("동등한 객체 입니다.");
		} else {
			System.out.println("동등하지 않은 객체 입니디ㅏ.");
		}
		
		Pair<String, String> p3 = new Pair<String, String>("홍길동", "1234");
		Pair<String, String> p4 = new Pair<String, String>("홍길동1", "1234");
		boolean result2 = Util1.compare(p3, p4);
		
		if(result2) {
			System.out.println("동등한 객체 입니다.");
		} else {
			System.out.println("동등하지 않은 객체 입니디ㅏ.");
		}

	}	
	

}
