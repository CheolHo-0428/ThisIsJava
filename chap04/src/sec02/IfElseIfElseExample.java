package sec02;

import java.util.Scanner;


public class IfElseIfElseExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		
		int score = sc.nextInt();
		
		if(score>=90) {
			System.out.println(score + "점은 A등급 입니다.");
		} else if(score>=80) {
			System.out.println(score + "점은 B등급 입니다.");
		} else if(score>=70) {
			System.out.println(score + "점은 C등급 입니다.");
		} else {
			System.out.println(score + "점은 F등급 입니다.");
		}

	}

}
