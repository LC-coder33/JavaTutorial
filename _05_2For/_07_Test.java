package _05_2For;

public class _07_Test {

	public static void main(String[] args) {
//		int money = 4570;
//		int pay = 10000;
//		int changeN = pay - money;
//		String changeS = Integer.toString(pay - money); // 5430원
//		System.out.println(pay + "원 " + changeN / 10000 + "개");
//		for(int i = 0; i < 3; i++) {
//			for( int j = 10; j <= 10; j *= 10) {
//				pay /= j;
//				System.out.println(pay + "원 " + changeS.charAt(i) + "개");
//			}
//		}
		int money=4570;  // 가격
		int pay = 10000;  //지불금액
		int jan = pay-money;
		System.out.println(jan);
		int baseMoney = 10;
		for(;;) {
			jan/=10;
			if(jan <= 0) {
				break;
			}
			System.out.println(baseMoney +":"+ (jan%10)+"개");
			baseMoney *= 10;
		}
	}

}
