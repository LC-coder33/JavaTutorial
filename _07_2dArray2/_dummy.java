package _07_2dArray2;

public class _dummy {

	public static void main(String[] args) {
		int[][] nowBlock = {{0,0,1},
			  	{1,1,1},
			  	{1,0,0}};
System.out.println("현재 블록");
for(int i=0; i <nowBlock.length;i++) {
for(int j=0; j<nowBlock[i].length; j++) {
	System.out.print(nowBlock[i][j]+"\t");
}
System.out.println();
}

int[][] rightBlock = new int[3][3];		// 빈 이차원 배열 생성
//
//for(int i=0; i <rightBlock.length;i++) {
//for(int j=0; j<rightBlock[i].length; j++) {
//	System.out.print(rightBlock[i][j]+"\t");
//}
//System.out.println();
//}
// 0,0	0,1	 0,2
// 1,0	1,1	 1,2
// 2,0	2,1	 2,2

//System.out.println();
//rightBlock[0][0] = nowBlock[2][0];
//rightBlock[0][1] = nowBlock[1][0];
//rightBlock[0][2] = nowBlock[0][0];
//
//rightBlock[1][0] = nowBlock[2][1];
//rightBlock[1][1] = nowBlock[1][1];
//rightBlock[1][2] = nowBlock[0][1];
//
//rightBlock[2][0] = nowBlock[2][2];
//rightBlock[2][1] = nowBlock[1][2];
//rightBlock[2][2] = nowBlock[0][2];
System.out.println();
System.out.println("오른쪽회전 블록");
for(int i=0; i <rightBlock.length;i++) {
for(int j=0; j<rightBlock[i].length; j++) {
	rightBlock[i][j] = nowBlock[2-j][i];
}
}

for(int i=0; i <rightBlock.length;i++) {
for(int j=0; j<rightBlock[i].length; j++) {
	System.out.print(rightBlock[i][j]+"\t");
}
System.out.println();
}
}

}