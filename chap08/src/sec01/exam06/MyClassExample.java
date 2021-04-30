package sec01.exam06;

public class MyClassExample {

	public static void main(String[] args) {
		MyClass my = new MyClass();
		
		System.out.println("1)-----------------------");
		
		RemoteControl tv = my.rc;
		tv.turnOn();
		tv.setVolume(5);
		
		System.out.println("2)-----------------------");
		
		MyClass myAudio = new MyClass(new Audio());

		System.out.println("3)-----------------------");
		
		my.methodA();
		
		System.out.println("4)-----------------------");
		
		my.methodB(new Television());
	}

}
