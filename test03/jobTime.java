package test03;

public class jobTime {
	public static void main(String[] args) {

		int[][] num = { { 10, 11, 12 },
		                { 20, 21, 22 } };
		int total = 0;
		
		System.out.println("num 배열 길이: " + num.length);
		System.out.println("num[0] 배열 길이: " + num[0].length);
		System.out.println("num[1] 배열 길이: " + num[1].length);
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				total = total + num[i][j];
				System.out.println("num[" + i + "][" + j + "] : " + num[i][j]);	
			}
		}
		System.out.println("num 배열의 총합: " + total);
	}
};