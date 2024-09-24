package _12_Method;

public class Main {

	public static void main(String[] args) {
		Testmethod r = new Testmethod();
		
		// method study
		String a = "880104";
		a.substring(0,2);
		System.out.println(a.substring(0,2));
		String year = a.substring(0,2);
		System.out.println(year);
		System.out.println("19" + year);
		
		// 다음 에러의 원인을 서술하시오
		//int month = a.substring(2, 2);
		// 리턴타입이 String이다. 근데 저장 변수는 int 타입이다. 즉, 미스매치타입이 원인이다.
		
		System.out.println(a.contains("8"));
		String w = "개나리";
		String title = "오늘 컨디션 참 개나리야! ";
		System.out.println(title.contains(w));
		if(title.contains(w)) {
			System.out.println("욕하지 마세요.");
		} else {
			System.out.println("제목은 올바른 표현입니다.");
		}
		System.out.println(title.indexOf(w));
		
		// 과제 : 제목에서 개나리 부분을 *** 으로 바꾸시오.
		System.out.println(title.replace(w, "***"));
		
		String t1 = title.substring(0, title.indexOf(w));
		System.out.println(t1);
		String t2 = title.substring(title.indexOf(w)+3);
		System.out.println(t2);
		System.out.println(t1 + "***" + t2);
		
		System.out.println(title.substring(title.indexOf(w),title.indexOf(" ",title.indexOf(w))));
	}

}
