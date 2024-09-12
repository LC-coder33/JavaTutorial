package _07_2dArray2;

public class _test05 {

    public static void main(String[] args) {
    	
    	/* 배열에 총 들어가야 하는 횟수는 4*5, 즉 a.length * a[0].length 와 같다. e.g) 5*6배열이면 30번
    	 * 오른 쪽으로 움직이면 다음은 아래, 그 다음은 왼쪽, 그 다음은 위, 다음은 오른 쪽 순으로 계속 반복된다.
    	 * 오른 쪽은 1
    	 * 아래는 2
    	 * 왼 쪽은 3
    	 * 위는 4
    	 * 순으로 계속 반복시키기 위해 1 2 3 4 를 반복시켜야 한다.
    	 * 총 20번 동안 1 2 3 4 반복 시키기 위해서,
    	 * 방향을 설정하는 direction을 만들어 1로 설정하고 이를 통해 최초로 오른쪽으로 움직이게 한다.
    	 * 1이 끝나면 minR을 증가시킨다. 현재 행 처리를 끝냈으니 현재 행의 바로 아래 행을 다시 처리해야 한다.
    	 * 2가 끝나면 maxC를 감소시킨다. 현재 열 처리를 끝내서 그 왼쪽 열을 처리해야 한다.
    	 * 3이 끝나면 maxR을 감소시킨다. 현재 행을 채웠으니 그 위 행을 처리해야 한다.
    	 * 4이 끝나면 minC를 증가시킨다. 현재 열 처리를 끝내고 다음 열을 처리해야하기 때문이다.
    	 * 이러한 과정을 반복하면 총 20번의 처리과정 끝에 테이블이 완성된다.
    	 *
    	 */
    	
        int[][] a = new int[4][5];
        int num = 1;
        int direction = 1;
        
        int maxC = a[0].length - 1;
        int minC = 0;
        int maxR = a.length - 1;
        int minR = 0;

        while (num <= a.length * a[0].length) {
            if (direction == 1) { // 오른쪽
                for (int j = minC; j <= maxC; j++) {
                    a[minR][j] = num++;
                }
                minR++;
                direction = 2;
            } else if (direction == 2) { // 아래
                for (int j = minR; j <= maxR; j++) {
                    a[j][maxC] = num++;
                }
                maxC--;
                direction = 3;
            } else if (direction == 3) { // 왼쪽
                for (int j = maxC; j >= minC; j--) {
                    a[maxR][j] = num++;
                }
                maxR--;
                direction = 4;
            } else if (direction == 4) { // 위
                for (int j = maxR; j >= minR; j--) {
                    a[j][minC] = num++;
                }
                minC++;
                direction = 1;
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}