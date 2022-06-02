import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        String[] num = String.valueOf(b).split("");
        int c = Integer.parseInt(num[2]);
        int d = Integer.parseInt(num[1]);
        int e = Integer.parseInt(num[0]);

        System.out.println(a * c);
        System.out.println(a * d);
        System.out.println(a * e);
        System.out.println(a * b);

        // 계산으로 해결한다면
        // 1의 자리 수 : b % 10
        // 10의 자리 수 : b / 10 % 10
        // 100의 자리 수: b / 100
        System.out.println(b % 10 * a );
        System.out.println(b / 10 % 10 * a);
        System.out.println(b / 100 * a);
        System.out.println(b * a);

    }

}
