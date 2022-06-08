import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class APlusBMinus310950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] num = br.readLine().split(" ");
            System.out.println(Integer.parseInt(num[0]) + Integer.parseInt(num[1]));
        }
    }
}
