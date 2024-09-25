package _10_Class_Ex_level2;

import java.util.Scanner;

public class MainMenu {
	EventAdmin eventAdm = null;
	MemberAdmin memberAdm = null;

	
	MainMenu(){
		if(eventAdm == null) {
			eventAdm = new EventAdmin();
		}
		if(memberAdm == null) {
			memberAdm = new MemberAdmin();
		}

		menu();
	}
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("1.고객관리");
			System.out.println("2.이벤트관리");
			System.out.println("3.프로그램종료");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				memberAdm.menu();
			}else if(num==2) {
				eventAdm.menu();
			}else if(num ==3) {
				break; 
			}
		}
		
		
	}

}
