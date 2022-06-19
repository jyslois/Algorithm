import java.io.*;

public class PlusCycle1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int num = n;
        int s = 0;
        int count = 0;

        while (true) {
            int a = num / 10;
            int b = num % 10;

            s = a + b;

            int c = s % 10;

            num = b * 10 + c;
            count++;
            if (num == n) {
                break;
            }
        }

        bw.write(String.valueOf(count));
        bw.flush();

        bw.close();
        br.close();

    }
}
