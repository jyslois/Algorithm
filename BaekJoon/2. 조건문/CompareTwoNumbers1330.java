import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CompareTwoNumbers1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] answer = br.readLine().split(" ");
        int a = Integer.parseInt(answer[0]);
        int b = Integer.parseInt(answer[1]);

        System.out.println(a > b ? ">" : a < b ? "<" : "==");

    }
}
