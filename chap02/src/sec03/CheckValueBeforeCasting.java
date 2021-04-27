package sec03;

import java.util.Scanner;


public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값을 입력해주세요: ");
		int i = sc.nextInt();
		
		if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) {
			System.out.println("byte 타입으로 변환할 수 없습니다.");
			System.out.println("값을 다시 확인해 주세요.");
		} else {
			byte b = (byte)i;
			System.out.println("byte값: "+ b);
		}
	}
}
