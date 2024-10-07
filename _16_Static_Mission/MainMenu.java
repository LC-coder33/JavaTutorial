package _16_Static_Mission;

import java.util.Scanner;

public class MainMenu {
	StudentAdmin studentAdm = null;
	ClassAdmin classAdm = null;
	LogIn log = null;
	
	MainMenu() {
		if(studentAdm == null) {
			studentAdm = new StudentAdmin();
			studentAdm.setClass(classAdm);
		}
		if(classAdm == null) {
			classAdm = new ClassAdmin();
			classAdm.setStu(studentAdm);
		}
		if(log == null) {
			log = new LogIn();
			log.classAdd(classAdm);
			log.stuAdd(studentAdm);
		}
		menu();
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1. 학생 관리");
			System.out.println("2. 교과목 관리");
			System.out.println("3. 로그인");
			System.out.println("4. 프로그램 종료");
			int sel = in.nextInt();
			in.nextLine();
			if(sel==1) {
				studentAdm.menu();
			} else if(sel == 2) {
				classAdm.menu();
			} else if(sel == 3) {
				System.out.println("아이디를 입력하세요.");
				String stu = in.nextLine();
				for(int i = 0; i < StudentAdmin.slist.size(); i++) {
					if(StudentAdmin.slist.get(i).getSid().equals(stu)) {
						log.setStudentId(stu);
						log.menu();
					}
				}
			} else if(sel == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 선택하세요.");
			}
		}
	}

}
