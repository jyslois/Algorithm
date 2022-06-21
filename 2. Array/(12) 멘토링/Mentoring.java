import java.io.*;
import java.util.StringTokenizer;

public class Mentoring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] math = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                math[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(solution(n, m, math)));
        bw.flush();

        br.close();
        bw.close();
    }

    public static int solution(int n, int m, int[][] math) {
        int answer = 0;
        // 짝을 지을 수 있는 총 경우는 멘토 1~n, 멘티 1~n, i=j도 상관없음 - 성적이 앞서야 하기 때문
        // 우선 학생 i가 멘토일 경우 학생 j보다 모든 테스트에서 앞서는 테스트
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<= n; j++) {  // i와 j는 학생 번호.
                // i의 등수가 j보다 앞서는 수(pi < pj): i랑 j가 멘토 멘티가 될 수 있는지
                int count = 0;
                for (int k = 0; k < m; k++) {   // k는 테스트 번호. 0~m-1까지
                    // i의 등수, j의 등수
                    int pi = 0, pj = 0;
                    // 즉, k번째 테스트에서 i와 j의 등수를 찾아내기.
                    for (int s = 0; s < n; s++) { // s는 등수
                        if (math[k][s] == i) {
                            pi = s;
                        }
                        if (math[k][s] == j) {
                            pj = s;
                        }
                    }
                    if (pi < pj) {
                        count++;
                    }
                }
                if (count == m) {
                    answer++;
                }

            }
        }

        return answer;
    }
}


