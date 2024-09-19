package _09_Class_Test01;

import java.util.Scanner;
public class Park_m {
	Car_Obj[]clist = new Car_Obj[7];
	Scanner in = new Scanner(System.in);
	Park_m() {
		while(true) {
			System.out.println("주차 관리자");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 전체보기");
			System.out.println("4. 삭제");
			System.out.println(" 선택 >>");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + "을 선택함");
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				check();
			}else if(selNum == 3) {
				allList();
			}else if(selNum == 4) {
				delete();
			} else {
				break;
			}
		}
	}
	public void add() {
		System.out.println("차량 등록");
		Car_Obj car = new Car_Obj();
		System.out.println("차량 번호 입력");
		car.cNum = in.nextInt();
		in.nextLine();
		System.out.println("차주 이름 입력");
		car.name = in.nextLine();
		for(int i = 0; i < clist.length; i++) {
			if(clist[i]==null) {
				clist[i] = car;
				break;
			}
		}
	}
	public void check() {
		System.out.println("차량 조회");
		int number = in.nextInt();
		if(clist[number]!=null) {
		System.out.println("차량 번호: " + clist[number].cNum);
		System.out.println("차주 이름: " +  clist[number].name);
		} else {
			System.out.println("이미 없는 차량입니다.");
		}
	}
	public void allList() {
		System.out.println("주차 차량 전체 보기");
		for(int i = 0; i < clist.length; i++) {
			if(clist[i]!=null) {
				clist[i].prt();
			}
		}
	}
	public void delete() {
		System.out.println("주차 끝난 차량");
		int parked = in.nextInt();
		if(clist[parked]!=null) {
			clist[parked] = null;
		}  else {
			System.out.println("이미 없는 차량입니다.");
		}
	}
}
