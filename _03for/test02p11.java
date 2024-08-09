package _03for;

public class test02p11 {

	public static void main(String[] args) {
		System.out.println("문제 11");
		int addedNumber = 0;
		for(int i = 100; i <= 999; i++) {
			addedNumber = ((i / 100) + (i / 10) % 10 + i % 10);
			if(addedNumber % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}