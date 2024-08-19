package _05_2For;

public class _00_Test {

	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			System.out.println("1*" + i + "=" + (1*i));
		}
		
		for(int dan = 1; dan <= 9; dan++) {
			System.out.println(dan);
			for(int i = 1; i <= 9; i++) {
				System.out.println(dan+ "x" + i + "=" + (dan*i));
			}
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
			System.out.print("*");	
			}
			System.out.println();
		}
		// id에 특수문자가 있는가?
		String id = "abc*"; // id 값
		String sign="*^$"; // 특수문자를 정의(* 나 ^ 나 $ 나 특수문자를 의미함)
		
		int cnt = 0;
		for(int i = 0; i < sign.length(); i++) {
			for(int j = 0; j < id.length(); j++) {
				if(sign.charAt(i) == id.charAt(j)) {
					System.out.println(sign.charAt(i)+"라는 특수문자가 존재함");
					cnt ++;
				}
			}
		}
		if(cnt > 0) {
			System.out.println("특수문자 있음");
		}
	}

}
