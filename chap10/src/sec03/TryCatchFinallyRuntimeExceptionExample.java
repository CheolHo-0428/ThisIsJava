package sec03;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String[] text = new String[2];
		
		text[0] = "a";
		text[1] = "b";
		
		String data1 = null;
		String data2 = null;
		String data3 = null;
		
		try {
			data1 = text[0];
			data2 = text[1];
			data3 = text[2];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("다시 실행하세요");
			return;
		}
		
		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
			return;
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변경할 수 없습니다.");
			System.out.println("다시 실행하세요");
			return;
		}

	}

}
