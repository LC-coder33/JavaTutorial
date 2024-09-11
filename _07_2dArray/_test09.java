package _07_2dArray;
import java.util.Scanner;
public class _test09 {

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
        int[][] a = {
            {12, 12, 12, 4},
            {1, 1, 1, 4},
            {1, 13, 13, 13},
            {14, 14, 14, 14},
            {14, 22, 13, 24},
            {14, 14, 14, 4}
        };
        System.out.println("좌표를 입력하세요. 10의 자리는 행 1의 자리는 열입니다.");
        int nNum = in.nextInt();
        in.nextLine();
        int leftNum = nNum / 10;
        int maxNum = a[0].length-1;
        for(int i = nNum / 10; i <= nNum / 10; i++) {
        	for(int j = nNum % 10; j < a[0].length; j++) {
        		if(a[i][0] == a[i][1] && a[i][0] == a[i][2] && a[i][0] == a[i][3]) {
        			for(int k = i; k > 0; k--) {
            			a[k][0] = a[k-1][0];
            			a[k][1] = a[k-1][1];
            			a[k][2] = a[k-1][2];
            			a[k][3] = a[k-1][3];
            				}
            			a[0][0] = (int)(Math.random() * 100);
            			a[0][1] = (int)(Math.random() * 100);
            			a[0][2] = (int)(Math.random() * 100);
            			a[0][3] = (int)(Math.random() * 100);
            			} else
        		if(j <= 1) {
        			if(a[i][j] == a[i][j+1] && a[i][j] == a[i][j+2]) {
        				for(int k = i; k > 0; k--) {
        			a[k][j] = a[k-1][j];
        			a[k][j+1] = a[k-1][j+1];
        			a[k][j+2] = a[k-1][j+2];
        				}
        			a[0][j] = (int)(Math.random() * 100);
        			a[0][j+1] = (int)(Math.random() * 100);
        			a[0][j+2] = (int)(Math.random() * 100);
        			}
        				} else if(j >= 2) {
        					if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j-2]) {
        						for(int k = i; k > 0; k--) {
        							a[k][j] = a[k-1][j];
        							a[k][j-1] = a[k-1][j-1];
        							a[k][j-2] = a[k-1][j-2];
        	        				}
        						a[0][j] = (int)(Math.random() * 100);
        						a[0][j-1] = (int)(Math.random() * 100);
        						a[0][j-2] = (int)(Math.random() * 100);
        				}
        					} else if(j > 0 && j < 3) {
        						if(a[i][j] == a[i][j-1] && a[i][j] == a[i][j+1]) {
        							for(int k = i; k >=0; k--) {
        								a[k][j] = a[k-1][j];
        								a[k][j+1] = a[k-1][j+1];
        								a[k][j-1] = a[k-1][j-1];
        	        					}
        							a[0][j] = (int)(Math.random() * 100);
        							a[0][j+1] = (int)(Math.random() * 100);
        							a[0][j-1] = (int)(Math.random() * 100);
        						}        		
        					}				
        			}
        }
        for(int w = 0; w < a.length; w++) {
        	for(int q = 0; q < a[0].length; q++) {
        		System.out.print(a[w][q] + " ");
        	}
        	System.out.println();
        }
    }
}