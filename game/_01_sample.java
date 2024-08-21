package game;

import java.util.Random;
import java.util.Scanner;

public class _01_sample {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        String[] levelOne = {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ","ㅅ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ"};
	        int score = 0;
	        Random rand = new Random();
	        
	        for(int i = 0; i <= 5; i++ ) {
	            score = 0;
	            for(int j = 0; j < 14; j++) {
	                // 선택된 문자를 저장
	                String randomChar = levelOne[rand.nextInt(levelOne.length)];
	                System.out.println("알맞은 단어를 입력하세요.");
	                System.out.println(randomChar);
	                
	                String answer = in.nextLine();
	                
	                // 입력한 답과 저장된 문자를 비교
	                if(answer.equals(randomChar)) {
	                    System.out.println("정답");
	                    score += 10;
	                } else {
	                    System.out.println("오답");
	                }
	            }
	            // 각 레벨에서의 점수를 출력
	            System.out.println("Level " + (i + 1) + " Score: " + score);
	        }
	        in.close();  // Scanner 객체를 닫아줍니다.

	}

}
