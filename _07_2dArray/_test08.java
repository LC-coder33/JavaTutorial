package _07_2dArray;

public class _test08 {

    public static void main(String[] args) {
        int[][] a = {
            {1, 1, 13, 4},
            {1, 1, 1, 4},
            {1, 13, 13, 13},
            {14, 17, 13, 19},
            {14, 22, 13, 24},
            {14, 2, 3, 4}
        };

        for (int i = 1; i < a.length-1; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == a[i - 1][j] && a[i][j] == a[i + 1][j]) {
                    System.out.println("세로로 같은 숫자" + " x: " + (i-1) + " y: " + j + "" + " = " + a[i][j] );
                    System.out.println("세로로 같은 숫자" + " x: " + i + " y: " + j + "" + " = " + a[i][j] );
                    System.out.println("세로로 같은 숫자" + " x: " + (i+1) + " y: " + j + "" + " = " + a[i][j] );
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a[0].length-1; j++) {
                if (a[i][j] == a[i][j-1] && a[i][j] == a[i][j + 1]) {
                    System.out.println("가로로 같은 숫자" + " x: " + i + " y: " + (j - 1) + "" + " = " + a[i][j] );
                    System.out.println("가로로 같은 숫자" + " x: " + i + " y: " + j + "" + " = " + a[i][j] );
                    System.out.println("가로로 같은 숫자" + " x: " + i + " y: " + (j + 1) + "" + " = " + a[i][j] );
                }
            }
        }
    }
}