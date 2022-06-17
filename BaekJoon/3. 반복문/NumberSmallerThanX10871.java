import java.io.*;
import java.util.StringTokenizer;

public class NumberSmallerThanX10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

//        st = new StringTokenizer(br.readLine(), " ");
//        int[] num = new int[n];
//        for (int i = 0; i < n; i++) {
//            num[i] = Integer.parseInt(st.nextToken());
//        }
//
//        for (int i : num) {
//            if (i < x) {
//                bw.write(i + " ");
//            }
//        }

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        while (st.hasMoreTokens()) {
            int i = Integer.parseInt(st.nextToken());
            if (i < x) {
                sb.append(i + " ");
            }
        }

        System.out.print(sb);

//        bw.flush();

        br.close();
        bw.close();
    }
}
