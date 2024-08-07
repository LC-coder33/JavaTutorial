package _02if;

public class _00_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Basic
		영수는 게임을 개발 중인데,
		명중에 따라 점수를 차등 부여하는 알고리즘을 개발 중이다. 
		int point = 20;
		int x = 40; // x는 화살의 위치이며 화살의 위치는 달라진다.
		화살의 위치가 0에서 12사이이면 +10점
		13-20 사이이면 +9점
		21-30 사이이면 +8점
		31이상이면 +7점을 부여한다.

		up1
		0부터 12사이면 +10점을 획득하고 
		0-1 사이이면 보너스 점수를 획득한다.
		보너스 점수는 현재 point의 10% 이다. */
		
		int point = 20;
		int x = 1;
		if(x <=12) {
			if(x <= 1) {
			System.out.println("10점 및 보너스 " + ((point)/10) + 
					"점을 추가하여 " + (point + 10 + (point)/10) + "점");
			} else {
			System.out.println("10점을 추가하여 " + (point + 10) + "점");
			} 
		}else if(x <=20) {
				System.out.println("9점을 추가하여 " + (point + 9) + "점");
		} else if(x <= 30) {
			System.out.println("8점을 추가하여 " + (point + 8) + "점");
		} else if(x >= 31) {
			System.out.println("7점을 추가하여 " + (point + 7) + "점");
		}
	}
}