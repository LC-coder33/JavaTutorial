package _04_Random;

import java.util.Scanner;

public class _01_Test {

	public static void main(String[] args) {
		Scanner twoNumber = new Scanner(System.in);
		System.out.println("수를 입력하시오.");
		int sum = 0;
		for(int i = 0; i <= 1; i++) {
			if(i == 0) {
				int a = twoNumber.nextInt();
				sum += a;
				System.out.println("첫번째 수는 " + a);
			} else if(i == 1){
				int b = twoNumber.nextInt();
				sum += b;
				System.out.println("두번째 수는 " + b);
			}
		}	System.out.println("두 수의 합은: " + sum);
	}

}
