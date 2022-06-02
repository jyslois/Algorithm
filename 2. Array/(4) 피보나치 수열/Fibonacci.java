import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        for (int x : solution(number)) {
            System.out.print(x + " ");
        }
    }

    public static int[] solution(int number) {
        int[] answer = new int[number];
        answer[0] = 1;
        answer[1] = 1;

        int first = 1, second = 1;

        for (int i = 2; i < number; i++) {
            answer[i] = first + second;
            first = second;
            second = answer[i];
        }

        // 혹은
//        for(int i = 2; i < number; i++){
//            answer[i] = answer[i-2] + answer[i-1];
//        }

        // 혹은 (손코딩)
//        public void solution(int number) {
//            int a = 1, b = 1, c;
//            System.out.print(a + " " + b + " ");
//            for (int i = 2; i < number; i++) {
//                c = a + b;
//                System.out.print(c + " ");
//                a = b;
//                b = c;
//            }
//        }

        return answer;
    }

}
