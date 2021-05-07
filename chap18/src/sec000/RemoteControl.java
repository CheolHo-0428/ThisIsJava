package sec000;

public interface RemoteControl {
	
	//상수
	public final static int MAX_VOLUME = 10;
	public final static int MIN_VOLUME = 0;
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
