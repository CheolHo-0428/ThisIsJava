package sec03;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		
		do {
			System.out.print("> ");
			input=sc.nextLine();
			System.out.println(input);
		} while(!input.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
	}
}
