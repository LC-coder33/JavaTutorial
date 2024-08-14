package _04_Random;
public class _07_Test3 {
	public static void main(String[] args) {
		int[] jobTime = {40, 32, 4, 16, 5, 8};
		for(int i = 0; i < jobTime.length; i++) {
			if(jobTime[0] <= 0 && jobTime[1] <= 0 && jobTime[2] <= 0 && jobTime[3] <= 0 &&
					jobTime[4] <= 0 && jobTime[5] <= 0 ){
				break;
			} else if(jobTime[i] <= 0) {
				if(i == (jobTime.length - 1)) {
					System.out.print("");
					i = -1;
				}
			} else {
			jobTime[i] -= 4;
			System.out.print(i + " ");
			if(i == (jobTime.length - 1)) {
				System.out.print("");
				i = -1;
				}
			}
		}
	}
}
// 0 1 2 3 4 5 0 1 3 4 5 0 1 3 0 1 3 0 1 0 1 0 1 0 1 0 0