import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OvenClock2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int duration = Integer.parseInt(br.readLine());

        hour = hour + ((minute + duration) / 60);

        hour %= 24;
//        if (hour > 23) {
//            hour = hour - 24;
//        }

        minute = (minute + duration) % 60;


        System.out.println(hour + " " + minute);


    }
}
