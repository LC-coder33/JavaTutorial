package game;

import java.util.Random;
import java.util.Scanner;

public class _00_game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] levelOne = {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ","ㅅ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};
		int score = 0;
		Random rand = new Random();
		
		 for (int i = 0; i < 5; i++) {
	            score = 0;

	            for (int j = 0; j < 14; j++) {
	                String randomChar = levelOne[rand.nextInt(levelOne.length)];
	                System.out.println("알맞은 단어를 입력하세요.");
	                System.out.println(randomChar);
	                String answer = in.nextLine();

	                if (answer.equals(randomChar)) {
	                    System.out.println("정답");
	                    score += 10;
	                } else {
	                    System.out.println("오답");
	                }
	                System.out.println("현재 점수: " + score);
	            }

	            if (score >= 100) {
	                System.out.println("레벨을 올립니다.");
	            } else if (score >= 30) {
	                System.out.println("레벨을 유지합니다.");
	            } else {
	                System.out.println("레벨을 초기화합니다.");
	            }
	    }
	}

}
