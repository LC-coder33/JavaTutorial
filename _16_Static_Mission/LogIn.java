package _16_Static_Mission;

import java.util.ArrayList;
import java.util.Scanner;

public class LogIn {
	public static ArrayList<LogOne> llist = new ArrayList<>();
	StudentAdmin stuAdm = null;
	ClassAdmin classAdm = null;
	ArrayList<ClassOne> classes = null;
	public static ArrayList<StudentOne> stuList = StudentAdmin.slist;
	private String studentId;
	
	public void menu() {
		getLists();
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println(studentId + "의 수강신청 페이지입니다.");
			System.out.println("1. 교과목 등록");
			System.out.println("2. 교과목 리스트 확인");
			System.out.println("3. 메인 메뉴로 돌아가기");
			int sel = in.nextInt();
			in.nextLine();
			if(sel == 1) {
				addCourse();
			}else if(sel == 2) {
				courselist();
			}else if(sel == 3) {
				System.out.println("메인 메뉴로 돌아갑니다.");
				break;
			}else
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	public void addCourse() {
		for(int i = 0; i < classes.size(); i ++) {
			classes.get(i).cPrt();
		}
		LogOne LO = new LogOne();
		LO.sId = studentId;
		Scanner in = new Scanner(System.in);
		System.out.println("원하는 과목을 선택하세요.");
		String choose = in.nextLine();
		for(int i = 0; i < classes.size(); i++) {
			if(classes.get(i).getCname().equals(choose)) {
				System.out.println(classes.get(i).getCname());
				LO.cName = choose;
			}
		}
		for(int i = 0; i < StudentAdmin.slist.size(); i++) {
			if(StudentAdmin.slist.get(i).getSid().equals(studentId)) {
				LO.sName = studentId;
				llist.add(LO);
			}
		}
	}
	
	public void courselist() {
		Scanner in = new Scanner(System.in);
		System.out.println("아이디를 입력하세요.");
		String search = in.nextLine();
		for(int i = 0; i < llist.size(); i++) {
			if(llist.get(i).sId.equals(search)) {
				System.out.println(llist.get(i).cName);
			}
		}
		
	}
	
	public void classAdd(ClassAdmin classAdm) {
		this.classAdm = classAdm;
		
	}
	public void getLists() {
		classes = classAdm.clist;
	}
	
	public void setStudentId(String stu) {
		studentId = stu;
	}
	
	public void stuAdd(StudentAdmin stuAdm) {
		this.stuAdm = stuAdm;
	}
}
