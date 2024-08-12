package _03for;

public class test02 {

	public static void main(String[] args) {
		
		// 문제 1
		System.out.println("문제 1");
		for(int i = 100; i <= 999; i++) {
			if(i % 2 != 0 ) {
				System.out.print(i + " ");
			}
		}
				System.out.println(" ");
		
		// 문제 2
		System.out.println("문제 2");
		int oddSum = 0;
		for(int i = 0; i <= 100; i++) {
			if(i % 2 != 0) {
				oddSum += i;
			}
		}
		System.out.println(oddSum);
				
		// 문제 3
		System.out.println("문제 3");
		for(int i = 10; i >= 1; i --) {
			System.out.print(i + " ");
		}
		System.out.println(" ");
		
		// 문제 4
		System.out.println("문제 4");
		int[] arr = {45, 23, 25, 64, 3, 24, 48};
		for(int i = 0; i < 7; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(" ");
		
		// 문제 6
		System.out.println("문제 5");
		for(int i = 0; i < 7; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		// 문제 7
		System.out.println(" ");
		System.out.println("문제 7");
		int sumArr = 0;
		for(int i = 0; i < 7; i++) {
			sumArr += arr[i];
		}
		System.out.println(sumArr);
		
		// 문제 8
		System.out.println("문제 8");
		int arrCnt = 0;
		for(int i = 0; i < 7; i++) {
			if(arr[i] % 2 == 0) {
				arrCnt++;
			}
		}
		System.out.println(arrCnt + "개");
		
		// 문제 9
		System.out.println("문제 9");
		String test = "abcdeabce";
		int charSum = 0;
		for(int i = 0; i < 9; i++) {
			char aaa = test.charAt(i);
			System.out.println(aaa);
			if(aaa == 'a') {
				charSum++;
		}
		}
		System.out.println(charSum + "개");
		
		// 문제 10
		System.out.println("문제 10");
		int maxArr = 0;
		int maxIndex = 0;
		for(int i = 0; i < 7; i++) {
			if(maxArr < arr[i]) {
				maxArr = arr[i];
				maxIndex = i;
			}
		}
		System.out.print("최대값은 "+ maxArr);
		System.out.println("이고 인덱스는 " + maxIndex + "번째 인덱스이다.");
		
		// 문제 11
		System.out.println("문제 11");
		int addedNumber = 0;
		for(int i = 100; i <= 999; i++) {
			addedNumber = ((i / 100) + (i / 10) % 10 + i % 10);
			if(addedNumber % 2 == 0) {
				System.out.print(i + " ");
				System.out.println(" ");
			}
		}
		
		//문제 12
		System.out.println("문제 12");
		int[] tunnel1 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int cCnt = 0;
		int mCnt = 0;
		for(int i = 0; i < tunnel1.length; i++) {
			if(tunnel1[i] == 0) {
				cCnt++;
				} else {
					cCnt = 0;
				} if(cCnt > mCnt) {
					mCnt = cCnt;
				}
		}
		System.out.println("터널의 길이: " + mCnt);
		
		// 문제 13
		System.out.println("문제 13");
		int[] tunnel2 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int cCount = 0;
		int mCount = 0;
		int tunnelNumber = tunnel2[0];
		for(int i = 0; i < tunnel2.length; i++) {
			if(tunnel2[i] == tunnelNumber) {
				cCount++;
			} else {
				tunnelNumber=tunnel2[i+1];
				cCount = 0;
			} if(cCount > mCount) {
				mCount = cCount;
			}
		}
		System.out.println("터널의 길이: " + mCount);
		
		// 문제 14
		System.out.println("문제 14");
		String ttt="aabbbcccaaaaddbbbaaaaa";
		int currentCount = 0;
	}
}











