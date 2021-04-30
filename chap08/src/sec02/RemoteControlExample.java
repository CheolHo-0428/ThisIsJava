package sec02;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		
		
		/*
		RemoteControl rc;
		rc = new Television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println();
		
		RemoteControl rc1;
		rc1 = new Audio();
		
		rc1.turnOn();
		rc1.setVolume(8);
		rc1.turnOff();
		*/

	}

}
