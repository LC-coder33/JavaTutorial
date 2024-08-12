package _03for;

public class test03p00 {

	public static void main(String[] args) {
		int[] letter = {8,12,4,13,2,14,4,5};
		for(int i = 0; i < 7; i++) {
			if(letter[i] % 2 == 0) {
				System.out.print( letter[i] + " ");
			}
		}
	}
}
