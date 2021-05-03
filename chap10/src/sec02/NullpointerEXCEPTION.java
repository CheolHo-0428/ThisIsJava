package sec02;

public class NullpointerEXCEPTION {

	public static void main(String[] args) {
		String data1 = "조철호";
		String data2 = null;
		
		if(data1.equals(data2)) {
			System.out.println("두문자열은 같습니다.");
		} else {
			System.out.println("두문자열은 다릅니다.");
		}

	}

}
