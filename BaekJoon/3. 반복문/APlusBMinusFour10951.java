import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class APlusBMinusFour10951 {
    public static void main(String[] args) throws IOException {
//        // Scanner
//        Scanner scan = new Scanner(System.in);
//
//        // 어차피 입력이 들어오지 않기 때문에 hasNext()를 사용해도 가능
//        // 참고로 hasNextInt() 의 경우 입력값이 정수일경우 true를 반환하며
//        // 정수가 아닐경우 바로 예외를 던지며 더이상의 입력을 받지 않고
//        // hasNextInt()에서 false를 반환하면서 반복문이 종료된다.
//        // 앤터나 스페이스도 인식하기 때문에 control+d로
//        // 더이상 읽을 수 없는 데이터(EOF - End of File)가 없음을 알려주어야 한다.
//
//        while (scan.hasNextInt()) {
//            int a = scan.nextInt();
//            int b = scan.nextInt();
//            System.out.println(a+b);
//        }
//
//        scan.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num;

        while ((num = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(num, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(a+b));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
