import java.io.*;

public class NumberCount2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String num = Integer.toString(a * b * c);

        int[] answer = new int[10];

        for (int i = 0; i < num.length(); i++) {
            answer[num.charAt(i) - '0']++;
        }

        for (int x : answer) {
            bw.write(x + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
