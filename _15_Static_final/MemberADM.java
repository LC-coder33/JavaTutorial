package _15_Static_final;

public class MemberADM {
	
	public final String name = "aabc";
	public static String companyName = "Human";
	// private static String companyNum = "123";
	public static final String teamName = "jjj";
	
	MemberADM() {
		// this.name = "aaf"; 왜 안될까? 상수는 초기값이 결정된 후 변경 불가
		String name = Thread.currentThread().getName();
		//companyName = "HumOne"; 됨
		
		System.out.println(name + " 스레드가 MemberADM" + " 생성자 실행");
	}
	
	public static void prt() {
	// System.out.println(name);			
		// 위의 코드는 안된다. 왜냐하면 static은 객체가 만들어 지기 전에 결정된다. 클래스의 객체(인스턴스)가 아니라 클래스 자체에 속하기 때문이다.
		// 그런데 name 변수는 static(공용변수)이 아니라 객체가 만들어 질 때 마다 결정된다. 즉, ctrl+f11을 하면 이미 결정 된 sysout(name)
		// 에는 aabc가 없다. 그렇다면 public static void prt 에서 static을 빼서, 객체가 만들어 질 때 같이 결정 될 메서드로 만들어서 name이 결정 될 때 같이 결정되게
		// 만들던가, name을 static으로 만들어서 prt와 함께 객체로 만들어지기 전에 결정되도록 만든다. 결정이 될 타이밍을 같이 잡아줘야 prt가 name을 참조 할 수 있는 것이다.
	}
}
