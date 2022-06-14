import java.io.*;
import java.util.StringTokenizer;

public class MountainPeak {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] mountain = new int[n][n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                mountain[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(solution(n, mountain)));
        bw.flush();

        br.close();
        bw.close();

    }

    public static int solution(int n, int[][] mountain) {
        int answer = 0;

        int[] dx = {-1, 1, 0, 0}; // 행
        int[] dy = {0, 0, -1, 1}; // 열

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                // 네 방향 체크

                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    // 바운더리에 대한 조건이 먼저 나와야 바르게 검사된다.
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && mountain[i][j] <= mountain[nx][ny]) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    answer++;
                }

            }
        }

        return answer;
    }
}
