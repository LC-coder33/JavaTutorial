package _03for;

public class test03p01 {

	public static void main(String[] args) {
		System.out.println("문제 01");
		int[] letter = {8,12,4,13,2,14,4,5};
		int currentNumber = 0;
		int maxNumber = 0;
		int maxIndex = 0;
		
		for(int i = 0; i < 7; i++) {
			currentNumber = letter[i];
			if(currentNumber > maxNumber) {
				maxNumber = currentNumber;
				maxIndex = i+1;
			}
		} 
		System.out.println("가장 큰 수는 " + maxIndex + "번째 수이다.");
		System.out.println(" ");
	}

}
