package _03for;

public class test03 {

	public static void main(String[] args) {
		// 문제 00
		System.out.println("문제 00");
		int[] letter = {8,12,4,13,2,14,4,5};
		
		for(int i = 0; i < 7; i++) {
			if(letter[i] % 2 == 0) {
				System.out.print( letter[i] + " ");
			}
		}
		System.out.println(" ");
		System.out.println(" ");
		
		// 문제 01
		System.out.println("문제 01");
		
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
		
		// 문제 02
		System.out.println("문제 02");
		
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
		
		// 문제 03
		System.out.println("문제 03");
		
		int[] secretLetter={8,12,3,13,1,14,3,4};
		String word = "gehoudfkimjnlvy";
		String secretWord = "";
		
		for(int i = 0; i < secretLetter.length; i++) {
			secretWord += word.charAt(secretLetter[i]);
		}
		System.out.println(secretWord);
		System.out.println(" ");
		
		// 문제 04
		System.out.println("문제 04");
		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size = 2;
		int zeroCount = 0;
		int building = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				zeroCount++;
				if(zeroCount == size) {
					building++;
					zeroCount = 1;
				}
			} else {
				zeroCount = 0;
			}
		}
		System.out.println("빌딩은 총 " + building + "개이다.");
		System.out.println(" ");
		
		// 문제 05

		// 문제 06
		System.out.println("문제 06");
		// String a = "23-56+45*2-56";					//- 45 + 43 * 42
		// int calculatedResult = 0;
		
		// for(int i = 0; i < a.length(); i++)
			// calculatedResult += 23;
				// (char)45		// (char)43		// (char)42
		System.out.println(" ");
				
		// 문제 07
		System.out.println("문제 07");
		int [] b = {34, 2, 35, 8, 31, 45};
        for(int i = 0; i < b.length - 1; i++) {
        	if(i > (i + 1)) {
				b[i]=b[i]+b[i+1];
				b[i+1]=b[i]-b[i+1];
				b[i]=b[i]-b[i+1];
			}
		}
		System.out.println(b[b.length-1]);	
		System.out.println(" ");
		
        // 문제 08
		System.out.println("문제 08");
		int [] c = {34, 2, 35, 8, 31, 45};
		for(int i=1;i<c.length-1;i++) {
		if(c[i]>c[i+1]) {
			c[i]=c[i]+c[i+1];
			c[i+1]=c[i]-c[i+1];
			c[i]=c[i]-c[i+1];
		}
		if(c[c.length-1]>c[0]) {
			c[0]=c[c.length-1];
		}
	}
	System.out.println(c[0]);
	}
}
































