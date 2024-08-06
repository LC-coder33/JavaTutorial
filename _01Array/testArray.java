package _01Array;

public class testArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제 1
		int[] arNumber = {30, 40, 50, 60, 55};
		System.out.println(arNumber[0]+" "+arNumber[1]+" "+
				arNumber[2]+" "+arNumber[3]+" "+arNumber[4]);
		
		// 문제 2
		String[] lName = {"kim", "lee", "park"};
		System.out.println(lName[0]+" "+lName[1]+" "+lName[2]);
		
		// 문제 3
		int[] lotto = {6, 12, 33, 4, 5, 26};
		System.out.println(lotto[2]+2);
		
		// 문제 4
		System.out.println(lotto[0]+lotto[2]+lotto[4]);
		
		// 문제 5
		lotto[0]=lotto[0];
		lotto[1]+=lotto[0];
		lotto[2]+=lotto[1];
		lotto[3]+=lotto[2];
		lotto[4]+=lotto[3];
		lotto[5]+=lotto[4];
		System.out.println(lotto[0] + " " + lotto[1] + " " + lotto[2]
				+" " + lotto[3] + " " + lotto[4] + " " + lotto[5]);
		
		// 문제 6
		lotto[1]=12;
		lotto[2]=33;
		lotto[3]=4;
		lotto[4]=5;
		lotto[5]=26;
		
		System.out.println(lotto[3] % 2 != 0);
		
		// 문제 7
		int money = 2750;
		int pay = 10000;
		int change = pay - money;
		int tChange = change / 1000;
		int hChange = (change - 7000) / 100;
		int tenChange = (change - 7200) / 10;
		
		System.out.println("천원 " +tChange+ "개 " + "백원 "+ hChange + "개 "
				+ "십원 " + tenChange + "개");
		
		// 문제 8
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		
		int xC = 650;
		int yC = 150;
		int xBall = 3;
		int yBall = 3;
		int xcBall = xC + xBall;
		int ycBall = yC + yBall;
		
		// double xRandom = Math.random()*300;
		// double yRandom = Math.random()*300;
		
		// double xCoordinate = xcBall + xRandom;
		// double yCoordinate = ycBall + yRandom;
		// System.out.println(xCoordinate + " " + yCoordinate);
		
		/* System.out.println((xCoordinate >= xA && xCoordinate <= xB) &&
		(yCoordinate >= yB && yCoordinate <= yA)); */
		
		System.out.println((xcBall >= xA && xcBall <= xB) &&
				(ycBall >= yB && ycBall <= yA)); 
	}

}
