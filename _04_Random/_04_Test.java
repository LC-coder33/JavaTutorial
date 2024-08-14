package _04_Random;

import java.util.Random;

public class _04_Test {

	public static void main(String[] args) {
		
		int[] rArray = new int[10];
		Random hNumbers = new Random();
		int oddCount = 0;
		int zeroCount = 0;
		for(int i = 0; i < rArray.length; i++) {
			int k = hNumbers.nextInt(100);
			if(k % 2 != 0) {
				oddCount++;
				continue;
			} else if(k == 0) {
				zeroCount++;
			}
			else {
				rArray[i] = k;
			}
			System.out.print(rArray[i] + " ");
		} 
		System.out.println(" ");
		System.out.println("홀수의 개수: " + oddCount);
		System.out.println("0의 개수: " + zeroCount);
	}
}
