package _11_Class_Test02;

import java.util.Scanner;

public class ManagementCenter {
	// 의존관계 변수만 설정하고 주소를
	// 저장하는 방법은 직접 객체를 만들거나
	// 주소를 주입 받는 방식이 있으니
	// 이 부분을 생각해서 공부하자
	// CUstomerOne cOne = null;
	
	CustomerOne[] cList = new CustomerOne[10];
	String[] eList = {"추석 이벤트","신규 이벤트","복귀 이벤트"};
	Scanner in = new Scanner(System.in);
	
	ManagementCenter() {
		int selNum = 0;
		while(true) {
			menu();
			System.out.println("원하시는 메뉴를 선택해주세요.");
			selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				cAdd();
			} else if(selNum == 2) {
				cPrt();
			} else if(selNum == 3) {
				cMod();
			} else if(selNum == 4) {
				cDel();
			} else if(selNum == 5) {
				eAdd();
			} else if(selNum == 6) {
				ePrt();
			} else if(selNum == 7) {
				eePrt();
			}
			else {
				System.out.println("잘못 입력하셨습니다. 첫 페이지로 돌아갑니다.");
				continue;
			}
		}
	}

	public void menu() {
		System.out.println("1. 회원가입");
		System.out.println("2. 정보보기");
		System.out.println("3. 수정하기");
		System.out.println("4. 삭제하기");
		System.out.println("5. 이벤트 등록");
		System.out.println("6. 회원 별 이벤트 확인하기");
		System.out.println("7. 전체보기");
		System.out.println("메뉴를 선택하세요>>>>");
	}

	public void cAdd() {
		System.out.println("회원 가입");
		CustomerOne customer = new CustomerOne();
		System.out.println("아이디 입력");
		customer.cId = in.nextLine();
		System.out.println("이름 입력");
		customer.cName = in.nextLine();
		for(int i = 0; i < cList.length; i++) {
			if(cList[i] == null) {
				cList[i] = customer;
				break;
			}
		}
		
	}

	public void cPrt() {
		System.out.println("검색하실 아이디를 입력하세요.");
		int cnt = 0;
		String temp = in.nextLine();
		for(int i = 0; i < cList.length; i++) {
			if(cList[i] != null) {
				if(cList[i].cId.equals(temp)) {
					cnt++;
					cList[i].prt();
					break;
				} else {
					System.out.println("아이디 찾는 중...");
				} 
			}
		}
		if(cnt == 0) {
			System.out.println("그런 아이디는 없습니다.");
			cnt = 0;
		}
	}

	public void cMod() {
		System.out.println("수정할 아이디 입력");
		String modId = in.nextLine();
		int cnt = 0;
		for(int i = 0; i < cList.length; i++) {
			if(cList[i] != null) {
				if(cList[i].cId.equals(modId)) {
					cnt++;
					System.out.println("수정할 아이디 입력");
					String changeId = in.nextLine();
					cList[i].cId = changeId;
					System.out.println("수정할 이름 입력");
					String changeName = in.nextLine();
					cList[i].cName = changeName;
					break;
					} 
			} else if(cnt == 0){
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	public void cDel() {
		System.out.println("회원 탈퇴할 아이디를 입력하세요.");
		String delNum = in.nextLine();
		for(int i = 0; i < cList.length; i++) {
			if(cList[i]!= null) {
				if(cList[i].cId.equals(delNum)) {
					cList[i] = null;
					break;
				}
			}
		}
	}

	public void eAdd() {
		System.out.println("이벤트에 참여할 아이디를 입력하세요.");
		String eId = in.nextLine();
		for(int i = 0; i < cList.length; i++) {
			if(cList[i] != null) {
				if(cList[i].cId.equals(eId)) {
					System.out.println("이벤트를 선택하세요! 번호를 누르시면 됩니다. 1. 추석 이벤트 2. 신규 이벤트 3. 복귀 이벤트");
					int eventNum = in.nextInt();
					in.nextLine();
					if(eventNum < eList.length) {
					cList[i].eName = eList[eventNum];
					} else {
						System.out.println("잘못 입력하셨습니다.");
						break;
					}
					if(eventNum == 1) {
						System.out.println("추석 이벤트에 같이 올 가족 수를 적어주세요.");
						String summary = in.nextLine();
						cList[i].eBody = summary;
						} else if(eventNum == 2) {
							System.out.println("신규 이벤트에 참여 하고 싶은 날짜를 적어주세요. 신청 한 날로부터 한달 안에 참여하셔야합니다.");
							String summary = in.nextLine();
							cList[i].eBody = summary;
						} else if(eventNum == 3) {
							System.out.println("복귀하신 사유를 짧게 알려주세요!");
							String summary = in.nextLine();
							cList[i].eBody = summary;
						}
				}
			}
		}
	}

	public void ePrt() {
		System.out.println("이벤트가 있는 아이디를 입력하세요.");
		int cnt = 0;
		String temp = in.nextLine();
		for(int i = 0; i < cList.length; i++) {
			if(cList[i] != null && cList[i].eName != null) {
				if(cList[i].cId.equals(temp)) {
					cnt++;
					cList[i].ePrt();
					break;
				} else if(cnt == 0) {
					System.out.println("그런 아이디는 없습니다.");
				} else {
					System.out.println("아이디 찾는 중...");
				} 
			}
		}
	}
	public void eePrt() {
		System.out.println("전체 아이디를 확인합니다.");
		for(int i = 0; i < cList.length; i++) {

			if(cList[i]!=null) {
				cList[i].prt();
			}
		}
	}

}
