package sec01.exam06;

public class SmartTelevision implements Searchable, RemoteControl {
	
	private int volume;
	private String url;
	
	@Override
	public void turnOn() {
		System.out.println("스마트 티비를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("스마트 티비를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 스마트티비 볼륨: " + this.volume);

	}

	@Override
	public void search(int url) {
		System.out.println("검색 채널: " + url);

	}

}
