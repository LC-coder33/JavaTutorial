package _16_Static_Mission;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentAdmin {
	private final int MAXSTUDENTCNT = 10;
	public static ArrayList<StudentOne> slist = new ArrayList<>();
	ClassAdmin classAdm = null;
	LogIn login = null;
	StudentAdmin() {
		
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 검색");
			System.out.println("3. 학생 정보 삭제");
			System.out.println("4. 학생 전체 확인");
			System.out.println("5. 뒤로 가기");
			int sel = in.nextInt();
			in.nextLine();
			if(sel == 1) {
				addStu();
			}else if(sel == 2) {
				searchStu();
			}else if(sel == 3) {
				delStu();
			}else if(sel == 4) {
				alllistStu();
			} else if(sel == 5) {
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	public int duplicateId(String id) {
		for(int i = 0; i < slist.size(); i++) {
			if(slist.get(i).getSid().equals(id)) {
				return 1;	// 중복 됨
			}
		}
		return 0;		// 중복 되지 않음
	}

	public void addStu() {
		Scanner in = new Scanner(System.in);
		if(slist.size() == MAXSTUDENTCNT) {
			System.out.println("학생 수가 최대치에 도달했습니다.");
		} else if(slist.size() != MAXSTUDENTCNT) {
		StudentOne stu = new StudentOne();
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		if(duplicateId(id) == 1) {
			System.out.println("입력한 아이디는 중복 됨");
		}else {
			stu.setSid(id);
			System.out.println("이름을 입력하세요.");
			String name = in.nextLine();
			stu.setSname(name);
			System.out.println("전화번호를 입력하세요.");
			String num = in.nextLine();
			stu.setSnum(num);
			System.out.println("학년을 입력하세요.");
			int grade = in.nextInt();
			stu.setSgrade(grade);
			slist.add(stu);
			}
		}
	}
	
	public void searchStu() {
		Scanner in = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = in.nextLine();
		for(int i = 0; i < slist.size(); i++) {
			if(slist.get(i).getSname().contains(name)) {
				System.out.println("이름: " + slist.get(i).getSname() + " 아이디: " + slist.get(i).getSid());
			}
		}
	}
	
	public void delStu() {
		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String id = in.nextLine();
		for(int i = 0; i < slist.size(); i++) {
			if(slist.get(i).getSid().equals(id)) {
				slist.remove(i);
			}
		}
	}
	
	public void alllistStu() {
		int cnt = 0;
		for(int i = 0; i < slist.size(); i++) {
			for(int j = 0; j < LogIn.llist.size(); j++) {
				if(slist.get(i).getSid().equals(LogIn.llist.get(j).sId)) {
					cnt++;
				}
			}
			slist.get(i).sPrt();
			System.out.println(slist.get(i).getSname() + "의 수업 개수: " + cnt);
			cnt = 0;
		}
	}
	
	public void setClass(ClassAdmin classAdm) {
		this.classAdm = classAdm;
	}
}
