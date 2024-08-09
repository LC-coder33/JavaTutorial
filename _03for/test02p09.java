package _03for;

public class test02p09 {

	public static void main(String[] args) {
		String test = "abcdeabce";
		int charSum = 0;
		for(int i = 0; i < 9; i++) {
			char aaa = test.charAt(i);
			System.out.println(aaa);
			if(aaa == 'a') {
				charSum++;
		}
		}
		System.out.println(charSum + "개");

	}

}
