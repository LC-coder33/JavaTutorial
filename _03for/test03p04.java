package _03for;

public class test03p04 {

	public static void main(String[] args) {
		System.out.println("문제 04");
		
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size = 2;
		int zeroCount = 0;
		int building = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				zeroCount++;
				if(zeroCount == size) {
					building++;
					zeroCount = 1;
				}
			} else {
				zeroCount = 0;
			}
		}
		System.out.println("빌딩은 총 " + building + "개이다.");
		System.out.println(" ");

	}

}
