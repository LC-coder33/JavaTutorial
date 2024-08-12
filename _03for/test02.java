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
		for(int i = 0; i < arr.length; i++) {
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
		/* 1. 현재 카운트 및 맥시멈 카운트를 0으로 설정
		 * 2. 터널숫자는 현재 설정된 터널 배열의 첫번째 숫자와 같게 한다
		 * 3. 이후 설정 될 가장 긴 터널의 숫자를 일단 0으로 설정
		 * 4. 만약 i 번째 터널의 숫자가 현재 설정된 터널의 숫자와 같다면 cCount가 하나 올라간다.
		 * 5. 아니라면 현재 터널 숫자를 지금의 터널의 숫자로 설정한 뒤 카운트를 1로 설정함
		 * (이후 바로 다음 숫자로 i가 올라가기에 당장의 카운트는 0이 아닌 1이 되어야함)
		 * 6. 만약 현재 카운트 숫자가 최대값 카운트 숫자보다 크다면 mCount 를 cCount의 숫자로 바꾼다.
		 * 7. 만약 현재 카운트 숫자가 최대값보다 크다면 해당 카운트 수를 올린 숫자를 가장 긴 터널 숫자로
		 * 설정해준다.
		 */
		System.out.println("문제 13");
		int[] tunnel2 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int cCount = 0;
		int mCount = 0;
		int tunnelNumber = tunnel2[0];
		int arrNumber = 0;
		for(int i = 0; i < tunnel2.length; i++) {
			if(tunnel2[i] == tunnelNumber) {
				cCount++;
			} else {
				tunnelNumber=tunnel2[i];
				cCount = 1;
			} if(cCount > mCount) {
				mCount = cCount;
				arrNumber = tunnel2[i];
			}
		}
		System.out.print("터널의 길이는 " + mCount + "이고 ");
		System.out.println("가장 긴 터널의 이름은 " + arrNumber + "터널이다.");
		
		// 문제 14
		System.out.println("문제 14");
		String ttt="aabbbcccaaaaddbbbaaaaa";
		int currentCount = 0; String resultZip = "";
		int maximumCount = 0;
		char stunnelNumber = ttt.charAt(0);
		int tttNumber = 0;
		for(int i = 0; i < ttt.length(); i++) {
			if(stunnelNumber == ttt.charAt(i)) {
				currentCount++;
			} else {
				resultZip = resultZip + stunnelNumber + currentCount;
				stunnelNumber=ttt.charAt(i);
				currentCount = 1;
			}	if(currentCount > maximumCount) {		// 15번 문제에서는 불필요
				maximumCount = currentCount;
				tttNumber = stunnelNumber;
			}
		}
		resultZip = resultZip + stunnelNumber + currentCount;
		
		System.out.print("터널의 길이는 " + maximumCount + "이고 ");
		System.out.println("가장 긴 터널의 이름은 " + (char)tttNumber + "터널이다.");
		 
		// 문제 15
		System.out.println("문제 15");
		System.out.println(resultZip);
	}
}











