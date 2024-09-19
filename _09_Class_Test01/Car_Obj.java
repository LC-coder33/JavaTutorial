package _09_Class_Test01;

public class Car_Obj {

	int cNum = 0;	// 차량 번호
	String name = null;	// 차주 이름
	
	public void prt() {
		System.out.println("----차량 및 차주 정보----");
		System.out.println("차량 번호: " + cNum);
		System.out.println("차주 이름: " + name);
	}
}
