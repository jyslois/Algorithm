import java.io.*;
import java.util.HashSet;

public class TheRemainder3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(br.readLine()) % 42;
        }

        HashSet<Integer> answer = new HashSet<>();

        for (int n : num) {
            answer.add(n);
        }

        bw.write(String.valueOf(answer.size()));
        bw.flush();

        bw.close();
        br.close();

    }
}
