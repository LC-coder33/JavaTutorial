package _14_접근제어자_01;

import _14_접근제어자_02.MemberOne;

public class Main {

	public static void main(String[] args) {
		MemberOne m = new MemberOne();
		// m.name="hong";		// error why? name변수가 default이기 때문
		
		m.prt();	// prt의 접근제어자는 public이기 때문에 사용 가능
		m.setName("1234");
		m.setName("4567");
	}

}
