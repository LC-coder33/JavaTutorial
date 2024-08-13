package _03for;

public class test03p03 {

	public static void main(String[] args) {
		System.out.println("문제 03");
		
		int[] secretLetter={8,12,3,13,1,14,3,4};
		String word = "gehoudfkimjnlvy";
		String secretWord = "";
		
		for(int i = 0; i < secretLetter.length; i++) {
			secretWord += word.charAt(secretLetter[i]);
		}
		System.out.println(secretWord);
		System.out.println(" ");
		

	}

}
