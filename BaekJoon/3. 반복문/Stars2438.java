import java.io.*;

public class Stars2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

//        StringBuilder stars = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            stars.append("*");
//            bw.write(stars + "\n");
//        }
//
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
