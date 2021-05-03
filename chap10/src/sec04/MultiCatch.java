package sec04;

public class MultiCatch {

	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			
			System.out.println(result);
			
			return;
		} catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
			System.out.println("다시실행하세요");
			return;
		} catch(Exception e) {
			System.out.println("알수없는 오류 발생");
			System.out.println("다시실행하세요");
			return;
		}

	}

}
