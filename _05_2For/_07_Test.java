package _05_2For;

public class _07_Test {

	public static void main(String[] args) {
		int money = 4570;
		int pay = 10000;
		int changeN = pay - money;
		String changeS = Integer.toString(pay - money); // 5430원
		System.out.println(pay + "원 " + changeN / 10000 + "개");
		for(int i = 0; i < 3; i++) {
			for( int j = 10; j <= 10; j *= 10) {
				pay /= j;
				System.out.println(pay + "원 " + changeS.charAt(i) + "개");
			}
		}
	}

}
