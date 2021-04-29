package sec06;

public class Calculator2 {

	public static void main(String[] args) {
		
		Calculator1 myCalc = new Calculator1();
		System.out.println("정사각형의 넓이: "+ myCalc.areaRectangle(10));
		System.out.println("직사각형의 넓이: "+ myCalc.areaRectangle(10, 20));
	}

}
