package sec02;

import java.util.Scanner;

public class BooleanExample {

	public static void main(String[] args) {
		boolean stop = false;
		boolean go = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("stop? or go?: ");
		String sg = sc.next();
		
		if(sg == "stop") {
			System.out.println(stop + " :중지합니다.");
		} else {
			System.out.println(go + " :진행합니다.");
		}
	}
}
