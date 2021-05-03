package sec03;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("Samsung", "Android");
		
		String str = myPhone.toString();
		
		System.out.println(str);
		System.out.println(myPhone);

	}

}
