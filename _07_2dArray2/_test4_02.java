package _07_2dArray2;

public class _test4_02 {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		/* 	 
		 *  0  1   2   3   4   5   6   7
		 * 0 00  01  02  03  04  05  06  07
		 * 1 10  11  12  13  14  
		 * 2 20  21  22  23  24  
		 * 3 30  31  32  33  34  
		 * 
		 * 00 = 0
		 * 01 10 = 1
		 * 02 11 20 = 2
		 * 03 12 21 30 = 3
		 * 04 13 22 31 = 4 
		 * 14 23 32 = 5
		 * 24 33 = 6
		 * 34 = 7
		 */
			int rowA=a.length;
			int colA=a[0].length;
			
			for(int i = 0 ; i < rowA+colA - 1; i++) {	// i 값은 j순회를 총 몇번 할 건지에 대한 횟수
				System.out.println(i +  "번째 채우기를 합니다.");
				int newCol = i;
				for(int j = 0; j <=i; j++) {
					if(j>3) break;	// if절에서 한줄이면 괄호x
									// break 대신 continue를 사용해도 똑같이 작동함
									// break를 하면 더 이상의 코드 연산 없이 바로 빠져나가서 break가 더 좋다!
					if(newCol < 5) {
					// System.out.println("j<행> " + j + "/열 " + newCol);
						a[j][newCol] = num++;
					}
				newCol--;
				}
			}
			
			System.out.println(" ");
			
			for(int i = 0; i < a.length; i++) {
				for(int j = 0;j < a[0].length; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println();
			}
		}
	}

