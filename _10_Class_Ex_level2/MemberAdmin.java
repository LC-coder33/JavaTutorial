package _10_Class_Ex_level2;

import java.util.Scanner;

//고객관리 클래스
public class MemberAdmin {
	MemberOne[] mlist = new MemberOne[5];
	
	MemberAdmin() {
		//menu();
	}
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.고객등록");
			System.out.println("2.전체보기");
			System.out.println("3.현재 이벤트 보기");
			System.out.println("9.이전메뉴");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				addUser();
			}else if(num==2) {
				allListUser();
			}else if(num==3) {
			}
			else if(num ==9) {
				break; // while문 종료
			}
		}
	}
	public int duplexIDcheck(String id) {
		for(int i=0; i < mlist.length; i++) {
			if(mlist[i]!=null) {
				if(mlist[i].id.equals(id)) {
					return 1;
					//return을 만나면 함수 종료되고 
					//호출부로 이동 된다. break필요없음
				}
			}
		}
		return 0;
	}
	private void addUser() {
		Scanner in = new Scanner(System.in);
		MemberOne temp = new MemberOne();
		System.out.println("아이디를 입력하세요");
		String id = in.nextLine();
		if(duplexIDcheck(id)==1) {
			System.out.println("입력한 아이디는 중복됨");
		}else {
			temp.id=id;
			System.out.println("이름을 입력하세요");
			String name = in.nextLine();
			temp.name=name;
			
			for(int i=0; i < mlist.length; i++) {
				if(mlist[i]==null) {
					mlist[i]=temp;
					break;
				}
			}
		}		
		temp=null;  // temp에 저장된 주소값이 필요없어서 null처리
		// in.close(); // Scanner 에 필요한 자원 반납
	}
	public void allListUser() {
		// TODO Auto-generated method stub
		for(int i=0; i < mlist.length; i++) {
			if(mlist[i]!=null) {
				mlist[i].prt();
			}
		}
		
	}
	
}
