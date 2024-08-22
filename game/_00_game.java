package game;

import java.util.Random;
import java.util.Scanner;

public class _00_game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] dummy = {""};		// 편의를 위해 level[0] 자리에 더미 배열 생성
		String[] levelOne = {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ","ㅂ","ㅅ","ㅇ","ㅈ","ㅊ","ㅋ","ㅌ","ㅍ","ㅎ","ㅓ"};
		String[] levelTwo = {"가","나","다","라","마","바","사","아","자","차","카","타","파","하","효"};
		String[] levelThree = {"우동", "마루","한달","가인","스벅","코스","운동","바람","액자","수육",
				"서버","국수","게임","이모","고모부"};
		String[] levelFour = {"된장국","김치국","수요일","요리사","종이컵","다람쥐","실험실","보라미",
				"영양제","아버지","어머니","작가님","오징어","시청률","짜장면"};
		String[] levelFive = {"견인지역","게르마늄","공기놀이","제기차기","어린이집","차량운행","안전운전",
				"안전제일","바른생활","게슴츠레","고슴도치","사자성어","비밀번호","만사형통","운수대통"};
		// 레벨에 따라 배열에 들어가는 단어들을 달리 한다
		String [] [] level = {dummy, levelOne, levelTwo, levelThree, levelFour, levelFive};
		// 편의를 위해 더미파일은 0 자리에 넣고 자리 1 부터는 각 숫자에 맞는 배열 배치
		int score = 0;						// 초기 점수 0점
		double cnt = 0;						// 맞춘 비율을 위한 전체 카운트
		double correctCnt = 0;					// 맞춘 비율을 위한 맞춘 문제 카운트
		int previousScore = 0; 
		Random rand = new Random();
		boolean test = true;
        while (test) {	// true값인 test를 while문에 넣어서 while문을 true상태로 만듦
            System.out.println("레벨을 선택하세요 (1 2 3 4 5):");
            int levelChoose = in.nextInt();
            in.nextLine(); // 입력 버퍼 비우기
            System.out.println(" ");

            if (levelChoose < 1 || levelChoose > 5) {
                System.out.println("잘못된 레벨입니다. 1부터 5까지의 레벨을 다시 입력하세요.");
                continue; // 잘못된 입력일 경우 다시 입력 받기
            }

            for (int i = levelChoose; i < 6; i++) {        // level 1부터 5까지 훑기 위한 for문
                previousScore = score;
            	score = 0;                    // 게임을 초기화 할 때마다 점수가 초기화되도록 설정

                for (int j = 0; j < 15; j++) {    // 선택된 i 배열을 총 15번 순회
                    String[] currentLevel = level[i];
                    // 코드에 의해 선택된 i 배열을 현재 문제지가 될 배열로 설정
                    int levelIndex = rand.nextInt(currentLevel.length);
                    // 선택 된 배열의 수보다 같거나 작은 무작위 정수를 생성하여 해당 정수에 해당 하는 인덱스를 조회;
                    // 이를 15번동안 반복
                    String randomChar = currentLevel[levelIndex];
                    // 위의 과정을 통해 구한 인덱스 위치에 있는 단어/글자를 변수로 저장

                    System.out.println("◆ " + i +  "단계" + " ◆");
                    System.out.println("같은 글자를 입력하세요.");
                    System.out.println("문제: " + randomChar); // 저장 된 변수를 문제로 제시
                    String answer = in.nextLine();

                    if (answer.equals(randomChar)) {        // 문제와 정답이 같을 시
                        System.out.print("정답! 10점 득점 || ");
                        score += 100;
                        cnt++;
                        correctCnt++;
                        
                    } else {
                        System.out.print("오답! 10점 감점 || ");            // 정답이 아닐 시
                        score -= 10;
                        cnt++;
                    }
                    System.out.println("현재 점수: " + score);        // 정답 유무와 관계 없이 점수를 출력
                    System.out.println(" ");
                    

                        if(score >=100 && i != 5) {
                        System.out.println(previousScore);
                        System.out.println(String.format("%.2f", (correctCnt/cnt)*100) + "% 의 비율로 맞추셨습니다.");
                        // 계속 사용 될 비율 계산 방식. 소수를 소숫점 두자리수까지 보이게 함
                        System.out.println("※ 레벨을 올립니다.");    
                        // 점수가 100점이 넘어갈 시 문제 제시 중단 후 즉시 레벨 업(현재 마지막 레벨 일 시, 제외)
                        System.out.println(" ");
                        break;
                        } else if(score >= 100 && i == 5) {
                        	System.out.println(String.format("%.2f", (correctCnt/cnt)*100) + "% 의 비율로 맞추셨습니다.");
                        	break;
                        // 레벨 5일 때 점수가 100이면 레벨을 올린다는 문구를 보여주지 않음
                        }
                }
                if (previousScore >= 100 && (correctCnt/cnt*100) == 100.00) {
                	System.out.println("두번이나 완벽하게 문제를 푸셨습니다! 축하합니다.");
                	i = i + 1;
                }
                if (score >= 30 && score < 100) {
                    // 30점 이상 100점 미만일 시 재도전
                	System.out.println(previousScore);
                	System.out.println(String.format("%.2f", (correctCnt/cnt)*100) + "% 의 비율로 맞추셨습니다.");
                    System.out.println("※ 레벨을 유지합니다.");
                    System.out.println(" ");

                    i = i - 1;
                } else if (score < 30) {
                    // 30점 미만일 시 레벨 1로 회귀
                	System.out.println(previousScore);
                	System.out.println(String.format("%.2f", (correctCnt/cnt)*100) + "% 의 비율로 맞추셨습니다.");
                    System.out.println("※ 1단계부터 다시 도전합니다.");
                    System.out.println(" ");
                    i = 0;
                }
                else if (score >= 100 && i == 5) {          // 마지막 레벨을 클리어할 시
                    System.out.println("축하합니다! 게임을 클리어하셨습니다!");
                    System.out.println("\r\n"
                            + " ██████╗ ██████╗ ███╗   ██╗ ██████╗ ██████╗  █████╗ ████████╗██╗   ██╗██╗      █████╗ ████████╗██╗ ██████╗ ███╗   ██╗██╗\r\n"
                            + "██╔════╝██╔═══██╗████╗  ██║██╔════╝ ██╔══██╗██╔══██╗╚══██╔══╝██║   ██║██║     ██╔══██╗╚══██╔══╝██║██╔═══██╗████╗  ██║██║\r\n"
                            + "██║     ██║   ██║██╔██╗ ██║██║  ███╗██████╔╝███████║   ██║   ██║   ██║██║     ███████║   ██║   ██║██║   ██║██╔██╗ ██║██║\r\n"
                            + "██║     ██║   ██║██║╚██╗██║██║   ██║██╔══██╗██╔══██║   ██║   ██║   ██║██║     ██╔══██║   ██║   ██║██║   ██║██║╚██╗██║╚═╝\r\n"
                            + "╚██████╗╚██████╔╝██║ ╚████║╚██████╔╝██║  ██║██║  ██║   ██║   ╚██████╔╝███████╗██║  ██║   ██║   ██║╚██████╔╝██║ ╚████║██╗\r\n"
                            + " ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝    ╚═════╝ ╚══════╝╚═╝  ╚═╝   ╚═╝   ╚═╝ ╚═════╝ ╚═╝  ╚═══╝╚═╝\r\n"
                            + "                                                                                                                        \r\n"
                            + "");
                    test = false;
                    
                    // 레벨 5때는 while문을 false로 만들어서 더 이상 진행하지 않도록 만듦
                }
            }
        }
    }
}
