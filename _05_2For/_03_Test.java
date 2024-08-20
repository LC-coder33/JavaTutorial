package _05_2For;

public class _03_Test {

	public static void main(String[] args) {
//		 for (int i = 1; i < 8; i += 2) {
//			 for (int j = 0; j < 3 - (i / 2); j++) {  // 0을 출력하는 횟수는 
//	                System.out.print("0");
//			 }
//	            for (int k = 0; k < i; k++) {	// '*' 문자를 i만큼 출력
//	                System.out.print("*");
//	            }
//	            // 줄 바꿈
//	            System.out.println();
//		}
		for(int i = 0; i < 4; i++) {
			for(int j =0; j < 4 + i; j++) {
				if(j >= 4 - i - 1) {
					System.out.print("*");
				} else {
				System.out.print("0");
				}
			}
			System.out.println("");
		}
	}

}
