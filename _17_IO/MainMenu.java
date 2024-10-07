package _17_IO;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MainMenu {
	private WordMge wManager = null;
	
	MainMenu() {
		init();
		Scanner in = new Scanner(System.in);
			while(true) {
				try {
				menu();
				System.out.println("메뉴 선택");
				int sel = in.nextInt();
				in.nextLine();
				if(sel == 1) {
					writeWord();
				} else if(sel == 2) {
					readWord();
				} else if(sel == 3) {
					readAll();
				} else if(sel == 4) {
					clearAll();
				} else if(sel == 5) {
					delete();
				}
		} catch (InputMismatchException e) {
			System.out.println("잘못 선택하셨습니다." + e.getMessage());
			in.nextLine();
				}
			}
		}
	
	private void init() {
		if(wManager == null) {
			wManager = new WordMge();
		}
	}
	
	private void menu() {
		System.out.println("1.단어 입력");
		System.out.println("2.단어 검색");
		System.out.println("3.단어 일괄 확인");
		System.out.println("4.단어장 비우기");
		System.out.println("5.단어 지우기");
	}
	
	private void readWord() {
		wManager.read();
	}
	
	private void writeWord() {
		wManager.write();
	}
	
	private void readAll() {
		wManager.readAll();
	}
	
	private void clearAll() {
		wManager.clear();
	}
	
	private void delete() {
		wManager.delete();
	}
 }
