package sec01.exam06;

public class SoundableExample {

	public static void aniVoice(Soundable s) {
		System.out.println(s.sound());
	}
	
	public static void main(String[] args) {
		aniVoice(new Cat());
		aniVoice(new Dog());

	}

}
