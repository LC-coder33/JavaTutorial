package _15_Static_final;

public class Main {
	// 접근 공용변수 리턴타임 메서드명 매개변수
	public static void main(String[] args) {
		
		String name = Thread.currentThread().getName();
		// 스레드가 코드를 실행한다.
		// 현재 코드를 실행하는 스레드의 여러 정보 중 
		//스레드의 이름을 가져온다.
		System.out.println(name+" 스레드가 1초 뒤에 시작합니다.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MemberADM m = new MemberADM();
		// static변수는 공용변수. 위치는 Method area
		// 모든 스레드가 공용해서 사용 가능 > 즉, 변수 값 접근가능
		// 객체를 만들지 ㅇ낳고 클래스명과 변수 또는 메서드 명으로 접근
		String a = MemberADM.companyName;
		System.out.println(a);
		System.out.println(MemberADM.companyName);
		MemberADM.prt();
		MemberADM.companyName = "HOman";
		System.out.println(MemberADM.companyName);
		// MemberADM.teamName = "kkk";	final을 사용했기 때문에 바꿀 수 없다.
		
		/*
		A Thread t1 = new Thread();
		t1.setName("task1_thread");
		String tname = t1.getName();
		System.out.println("새로 만든 스레드 이름은 " + tname);
		*/
	}
}
