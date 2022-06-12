import java.io.*;

public class GridGreatestSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[][] grid = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                grid[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        // 정수형을 Buffered Writer에 넣고 싶으면, String형으로의 변환이 필요하다.
        bw.write(String.valueOf(solution(n, grid)));
        bw.flush();

        bw.close();
        br.close();

    }

    public static int solution(int n, int[][] grid) {
        int sum1, sum2;
        int answer = Integer.MIN_VALUE;

        // 각 행과 열의 합 중 가장 큰 수
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += grid[i][j]; // 각 행의 합
                sum2 += grid[j][i]; // 각 열의 합
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        // 각 대각선의 합 중 가장 큰 수
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += grid[i][i];
            sum2 += grid[i][n-1-i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }
}
