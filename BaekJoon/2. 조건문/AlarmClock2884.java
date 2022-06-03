import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlarmClock2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(" ");
        int hour = Integer.parseInt(time[0]);
        int minute = Integer.parseInt(time[1]);

        if (minute - 45 < 0) {
            minute = 60 - Math.abs(minute - 45);
            if (hour - 1 < 0) {
                hour = 24 - Math.abs(hour - 1);
            } else {
                hour -= 1;
            }
        } else {
            minute -= 45;
        }

        System.out.println(hour + " " + minute);
    }
}