package _04_Random;

import java.util.Scanner;

public class _00_Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("입력된 숫자: ");
		int a = in.nextInt();
		in.nextLine();
		
		if((a % 2) == 0) {
			System.out.println("짝");
		} else {
			System.out.println("홀");
		}
	}

}
