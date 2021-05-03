package sec03;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2");
			return;
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			return;
		}

	}

}
