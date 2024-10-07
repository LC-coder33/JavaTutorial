package _16_Static_Mission;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassAdmin {
	ArrayList<ClassOne> clist = new ArrayList<>();
	StudentAdmin studentAdm = null;
	ClassAdmin() {
		
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 교과목 등록");
			System.out.println("2. 교과목 리스트 확인");
			System.out.println("3. 뒤로 가기");
			int sel = in.nextInt();
			in.nextLine();
			if(sel == 1) {
				addClass();
			}else if(sel == 2) {
				classlist();
			}else if(sel == 3) {
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public int sameClass(String cname) {
		for(int i = 0; i < clist.size(); i++ ) {
			if(clist.get(i).getCname().equals(cname)) {
				return 1;		// 중복 됨
			}
		}
		return 0;		// 중복 되지 않음
	}
	
	
	public void addClass() {
		Scanner in = new Scanner(System.in);
		System.out.println("과목명을 입력하세요.");
		String name = in.nextLine();
		if(sameClass(name) == 1) {
			System.out.println("입력한 과목은 중복 됨");
		} else {
			ClassOne CO = new ClassOne();
			CO.setCname(name);
			System.out.println("강의실을 입력하세요.");
			String cNum = in.nextLine();
			CO.setCnum(cNum);
			System.out.println("강의할 교수님 이름을 입력하세요.");
			String prof = in.nextLine();
			CO.setProfessor(prof);
			clist.add(CO);
		}
	}
	
	public void classlist() {
		for(int i = 0; i < clist.size(); i++) {
			clist.get(i).cPrt();
		}
	}
	
	public void setStu(StudentAdmin studentAdm) {
		this.studentAdm = studentAdm;
	}
}
