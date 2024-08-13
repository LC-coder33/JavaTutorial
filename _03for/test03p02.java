package _03for;

public class test03p02 {

	public static void main(String[] args) {
		System.out.println("문제 02");
		int[] letter = {8,12,4,13,2,14,4,5};
		int currentEvenNumber = 0;
		int suspect = 0;
		
		for(int i = 0; i < 7; i++) {
			currentEvenNumber = letter[i];
			if(currentEvenNumber > suspect && currentEvenNumber % 2 == 0) {
				suspect = currentEvenNumber;
			}
		}
		System.out.println("범인은 " + suspect + "이다.");
		System.out.println(" ");

	}

}
