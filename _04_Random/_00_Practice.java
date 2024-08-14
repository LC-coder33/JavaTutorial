package _04_Random;

// Ctrl + Shift = O: 필요한 클래스를 자동으로 불러온다.
import java.util.Random;

public class _00_Practice {

	public static void main(String[] args) {
		// 6개의 랜덤한 로또번호
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i = 0; i <lotto.length;i++) {
			int k = r.nextInt(45)+1; // r변수 참조하여 nextInt 라는 기능을 호출, 리턴 받은 수에 +1한다.
			lotto[i] = k;
		}
		for(int i = 0; i < lotto.length; i++) {
			if(i == lotto.length-1) {
				System.out.println("보너스: " + lotto[i]);
			} else {
			System.out.print(lotto[i] + " " );
			}
		}
	}

}
