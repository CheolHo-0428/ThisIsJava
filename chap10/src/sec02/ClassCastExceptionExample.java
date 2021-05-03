package sec02;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat); 

	}
	
	public static void changeDog(Animal animal) {
		//if(animal instanceof Dog) { //예외발생
			Dog dog = (Dog) animal;
		//}
	}

}