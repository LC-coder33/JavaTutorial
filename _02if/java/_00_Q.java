package _02if.java;

public class _00_Q {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int point = 20;
		int x = 1;
		if(x <=12) {
			if(x <= 1) {
			System.out.println("10점 및 보너스 " + ((point)/10) + 
					"점을 추가하여 " + (point + 10 + (point)/10) + "점");
			} else {
			System.out.println("10점을 추가하여 " + (point + 10) + "점");
			} 
		}else if(x <=20) {
				System.out.println("9점을 추가하여 " + (point + 9) + "점");
		} else if(x <= 30) {
			System.out.println("8점을 추가하여 " + (point + 8) + "점");
		} else if(x >= 31) {
			System.out.println("7점을 추가하여 " + (point + 7) + "점");
		}
	}
}