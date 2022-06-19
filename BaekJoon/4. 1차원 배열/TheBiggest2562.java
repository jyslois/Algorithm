import java.io.*;

public class TheBiggest2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] num = new int[9];

        int i = 0;
        while (i != 9) {
            num[i++] = Integer.parseInt(br.readLine());
        }

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;

        for (int x = 0; x < num.length; x++) {
            if (num[x] > max) {
                max = num[x];
                maxIndex = x+1;
            }
        }

        bw.write(max + "\n");
        bw.write(String.valueOf(maxIndex));

        bw.flush();
        bw.close();
        br.close();
    }
}
