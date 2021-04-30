package ex.ex03;

public class SoundableExample{
	//메소드
	public static void printlns(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printlns(new Dog());
		printlns(new Cat());
	
	}
}
