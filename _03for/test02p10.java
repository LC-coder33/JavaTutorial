package _03for;

public class test02p10 {

	public static void main(String[] args) {
		int[] arr = {45, 23, 25, 64, 3, 24, 48};
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

	}
}
