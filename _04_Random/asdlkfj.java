package _04_Random;

public class asdlkfj {

	public static void main(String[] args) {
		int[] jobTime = {40,32,4,16,5,8};

		System.out.println("문제 7번");
		String person = "";
		for (int a = 0; a < jobTime.length; a++) {
			if (jobTime[a] > 0) {
				jobTime[a] -= 4;
				person += a + " ";
//				System.out.println(jobTime[a]);
			} if (a == 5) {
				if (jobTime[0] > 0 || jobTime[1] > 0 || jobTime[2] > 0 ||
					jobTime[3] > 0 || jobTime[4] > 0 || jobTime[5] > 0) {
				a = -1;
				}
			}
		}
		System.out.println(person);

	}

}
