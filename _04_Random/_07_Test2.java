package _04_Random;
public class _07_Test2 {
	 public static void main(String[] args) {
	        int[] jobTime = {40, 32, 4, 16, 5, 8};
	        int tempLength = jobTime.length;

	        for (int i = 0; ; i = (i + 1) % tempLength) {
	            if (jobTime[i] > 0) {
	                jobTime[i] -= 4;
	                System.out.print(i + " ");
	            }

	            int nonZeroCount = 0;
	            for (int j = 0; j < tempLength; j++) {
	                nonZeroCount += (jobTime[j] > 0) ? 1 : 0;
	            }

	            if (nonZeroCount == 0) {
	                break;
	            }
	        }
	    }
	}