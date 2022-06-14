import java.io.*;

public class APlusBMinusEight11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        int n = 1;
        for (int i = 0; i < t; i++) {
            String[] nums = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);
            bw.write("Case #" + n++ + ": " + a + " + " + b + " = " + (a + b) + "\n");
//            System.out.printf("Case %d: %d + %d = %d\n", n++, a, b, a + b);
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
