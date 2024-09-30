package _14_접근제어자_02;

public class CatDTO {
	private String name = null;
	private int age = 1;
	// 멤버변수는 은닉화시킨다. 무엇으로? 접근제어자(private, public, default)로
	// 은닉화 시키면 CatDTO클래스 외부에서 변수에 참조를 어떻게 하려고??
	// 일단 은닉화 하고,, 멤버 변수에 저장 및 인출에 관련
	// 메서드를 만든다.. 저장하는 메서드를 getter
	// 인출하는 메서드를 setter 라고 부릅니다.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		chkName(name);
		this.name = name;
	}
	private void chkName(String name) {
		// TODO Auto-generated method stub
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
