import java.io.*;

public class FastAPlusB15552 {
    // Scanner 대신 BufferedReader을, System.out.print() 대신 BufferedWriter 사용하기.
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] nums = br.readLine().split(" ");
            // write()에는 자동 개행이 없어 + "\n" 을 붙여 주어야 한다.
            // write()을 사용하여 출력할 내용을 담는다
            bw.write((Integer.parseInt(nums[0]) + Integer.parseInt(nums[1])) + "\n");
        }

        // flush()를 통해서 버퍼를 비워내는 동시에 콘솔에 출력한다
        bw.flush();

        br.close();
        bw.close();
    }
}
