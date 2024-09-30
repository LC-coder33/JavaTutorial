package _14_접근제어자_02;

public class MemberOne {
	String name = null;			// 생략되었다면 앞에는 default가 자동으로 할당된다
	
	public void prt() {
		System.out.println(name);
	}
	
	public void setName(String n) {			// 이 메소드 또한 앞에는 default가 자동으로 할당된다
		if(chkName(n)) {
			this.name=n;
		} else {
			this.name="err";
		}
		System.out.println(this.name);
	}
	
	
	private boolean chkName(String n) {
		if(n.charAt(0)=='4') {
			return false;
		}
		return true;
	}
}
// chkName은 내부적으로 호출하는 메서드로 창의하였으므로 private가 적당함