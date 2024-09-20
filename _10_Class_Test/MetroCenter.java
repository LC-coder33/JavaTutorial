package _10_Class_Test;
import java.util.Scanner;
public class MetroCenter {
	MetroOne[] mList = new MetroOne[4];
	Maintenance[] fList = new Maintenance[4];
	Scanner in = new Scanner(System.in);
		
	MetroCenter() {
		int selNum = 0;
		while(true) {
			menu();
			System.out.println("메뉴 선택");
			selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				metroAdd();				// 메뉴의 1은 등록
			} else if(selNum == 2) {
				metroList();			// 메뉴의 2는 전체보기
			} else if(selNum == 3) {
				metroMod();				// 메뉴의 3은 수정
			} else if(selNum == 4) {
				metroMain();			// 메뉴의 4는 수리 중인 기차 보여주기
			} else {
				break;					// 1 2 3 4 외의 숫자를 누르면 프로그램을 끝낸다.
			}
		}
	}
	public void menu() {
		System.out.println("1. 등록");
		System.out.println("2. 전체보기");
		System.out.println("3. 수정");
		System.out.println("4. 수리 중...");
		System.out.println("메뉴를 선택하세요>>>>");
	}
	
	public void metroAdd() {
		System.out.println("기차 등록");
		MetroOne train = new MetroOne();
		Maintenance fix = new Maintenance();
		System.out.println("수리 중인 차량 등록 여부");
		boolean status = in.nextBoolean();
		in.nextLine();
		
		if(status == true) {					// 수리 중인 기차
			System.out.println("기차번호를 입력하세요.");
			String temp = in.nextLine();
			if(temp.equals("1111")) {			// 입력받은 숫자에 따라 기차 종류를 자동으로 입력한다.
				fix.metroNumber = temp;
				fix.metroInfo = "무궁화";
			} else if(temp.equals("2222")) {
				fix.metroNumber = temp;
				fix.metroInfo = "새마을";
			} else if(temp.equals("3333")) {
				fix.metroNumber = temp;
				fix.metroInfo = "무궁화";
			} else if(temp.equals("4444")) {
				fix.metroNumber = temp;
				fix.metroInfo = "새마을";
			} else {
				System.out.print("입력 오류입니다. ");	// 그 외의 번호는 입력되지 않는다.
			}
			if(temp.equals("1111") || temp.equals("2222") || temp.equals("3333") || temp.equals("4444")) {
			System.out.println("도착시간을 입력하세요..");		// 4가지의 기차 번호 외에는 받지 않는다.
			fix.arrival = in.nextLine();} else {
				System.out.println("처음으로 돌아갑니다.");
			}
			for(int i = 0; i < fList.length; i++) {
				if(fList[i] == null) {
					fList[i] = fix;
					break;
				}
			}
		}
		if(status == false) {					// 수리 중이지 않은, 정상 운행 중인 기차
			System.out.println("기차번호를 입력하세요.");
			String temp = in.nextLine();
			if(temp.equals("1111")) {			// 입력받은 숫자에 따라 기차 종류를 자동으로 입력한다.
				train.metroNumber = temp;
				train.metroInfo = "무궁화";
			} else if(temp.equals("2222")) {
				train.metroNumber = temp;
				train.metroInfo = "새마을";
			} else if(temp.equals("3333")) {
				train.metroNumber = temp;
				train.metroInfo = "무궁화";
			} else if(temp.equals("4444")) {
				train.metroNumber = temp;
				train.metroInfo = "새마을";
			} else {
				System.out.print("입력 오류입니다. ");	// 그 외의 번호는 입력되지 않는다.
			}
			if(temp.equals("1111") || temp.equals("2222") || temp.equals("3333") || temp.equals("4444")) {
			System.out.println("도착시간을 입력하세요..");		// 4가지의 기차 번호 외에는 받지 않는다.
			train.arrival = in.nextLine();} else {
				System.out.println("처음으로 돌아갑니다.");
			}
			for(int i = 0; i < mList.length; i++) {
				if(mList[i] == null) {
					mList[i] = train;
					break;
					}
				}
			}
		}
	
	
	public void metroList() {					// 정상 운행하는 기차 리스트
		for(int i = 0; i < mList.length; i++) {
			if(mList[i]!=null && mList[i].metroInfo == "새마을") {	// 새마을일 때만 * 추가
				mList[i].metroInfo = "새마을*";
				mList[i].prt();
			} else if(mList[i]!=null) {
				mList[i].prt();
			}
		}
	}
	
	public void metroMod() {
		System.out.println("수정할 차량 번호 입력");
		String modNumber = in.nextLine();
		System.out.println("수정할 시간 입력");
		String modTime = in.nextLine();
		for(int i = 0; i < mList.length; i++) {
			if(mList[i]!=null) {
				if(mList[i].metroNumber.equals(modNumber) && mList[i].arrival.equals(modTime)) {	
					// 수정할 차량과 시간이 존재할 때만 metroMod가 작동한다.
					System.out.println("수정 할 도착 시간 입력");
					String newTime = in.nextLine();
					mList[i].arrival = newTime;
					break;
				} else {
					System.out.println("입력 오류입니다.");	// 틀린 번호나 시간대를 입력하면 해당 메뉴는 종료된다.
				}
			}
		}
		
	}
	
	public void metroMain() {					// 수리 중인 기차 리스트
		for(int i = 0; i < fList.length; i++) {
			if(fList[i]!=null) {
				fList[i].fprt();
			}
		}
	}

}