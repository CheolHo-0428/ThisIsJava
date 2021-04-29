package sec04;

public class ComputerExample {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("원면적 : "+ calc.areaCalculator(10));
		
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원면적 : "+ com.areaCalculator(10));

	}

}
