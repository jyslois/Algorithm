import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BiggestAndSmallest10818 {
    public static void main(String[] args) throws IOException {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] num = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            num[i] = scan.nextInt();
//        }
//
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int x : num) {
//            if (x < min) {
//                min = x;
//            }
//            if (x > max) {
//                max = x;
//            }
//        }
//
//        System.out.print(min + " " + max);
//
//        scan.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        while (st.hasMoreTokens()) {
            num[index++] = Integer.parseInt(st.nextToken());
        }

//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        for (int x : num) {
//            if (x < min) {
//                min = x;
//            }
//            if (x > max) {
//                max = x;
//            }
//        }
//
//        bw.write(min + " " + max);

        Arrays.sort(num);

        bw.write(num[0] + " " + num[n-1]);

        bw.flush();

        bw.close();
        br.close();
    }
}
