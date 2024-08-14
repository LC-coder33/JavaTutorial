package _04_Random;

import java.util.Random;

public class _06_Test {

	public static void main(String[] args) {
		Random r = new Random();
		int[] nArray = new int[46];
		
		// 숫자가 나올 때 마다 해당 숫자를 가진 인덱스를 1씩 올린다
		for(int i = 0; i <= 10000; i++) {
			int num = r.nextInt(45) + 1;
			nArray[num]++;
		}
		
		// 가장 빈도가 높은 숫자의 인덱스를 찾는다
        int maxCount = 0;
        int maxIndex = ' ';
        for (int f = 1; f < nArray.length; f++) { // 인덱스 0은 사용하지 않는다
            if (nArray[f] > maxCount) {
                maxCount = nArray[f];
                maxIndex = f;
            }
        }

        // 결과 출력
        System.out.println("가장 많이 나온 숫자의 배열 번호: " + maxIndex);
        System.out.println("출현 빈도: " + maxCount + "번");
	}
	
}
