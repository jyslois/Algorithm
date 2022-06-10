import java.io.*;

public class PrintN2741 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {
            bw.write(i + "\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
