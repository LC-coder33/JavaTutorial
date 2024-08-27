package test03;

public class jobTime {

	public static void main(String[] args) {
		int[] jobTime = {40, 32, 4, 16, 5, 8};
		for(int i = 0; i < jobTime.length; i++) {
			if(jobTime[0] <= 0 && jobTime[1] <= 0 && jobTime[2] <= 0 && jobTime[3] <= 0 && jobTime[4] <= 0
					 && jobTime[5] <= 0) {
				break;
			} else if(jobTime[i] > 0){
					jobTime[i] -= 4;
					System.out.print(i + " ");
				}
				if(i == 5) {
					{
						if(jobTime[0] > 0 || jobTime[1] > 0 || jobTime[2] > 0 ||
								jobTime[3] > 0 || jobTime[4] > 0 || jobTime[5] > 0) 
							i = -1;
					}
				}
		}
	}
}
