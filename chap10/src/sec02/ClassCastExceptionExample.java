package sec02;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); 

	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog) { //μμΈλ°μ
			Dog dog = (Dog) animal;
		//}
	}

}