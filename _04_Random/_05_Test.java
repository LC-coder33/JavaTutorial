package _04_Random;

import java.util.Random;

public class _05_Test {

	public static void main(String[] args) {
		Random r = new Random();
		int[] nArray = new int[6];
		for(int i = 0; i < nArray.length; i++) {
			int num = r.nextInt(45) + 1;
			nArray[i] = num;
			System.out.print(nArray[i] + " ");
		}
	}
	
}
