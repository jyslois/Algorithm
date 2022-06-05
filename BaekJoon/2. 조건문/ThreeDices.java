import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeDices {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] dices = br.readLine().split(" ");
        int a = Integer.parseInt(dices[0]);
        int b = Integer.parseInt(dices[1]);
        int c = Integer.parseInt(dices[2]);
        System.out.println(solution(a, b, c));
    }

    public static int solution(int a, int b, int c) {
        if (a == b && b == c) {
            return 10000+a*1000;
        } else if (a != b && b != c && a != c) {
            return Math.max(Math.max(a, b), c)*100;
        } else {
            if (b == c) {
                return 1000+c*100;
            } else {
                return 1000+a*100;
            }
        }
    }
}
