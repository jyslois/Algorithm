import java.util.Scanner;

public class TheAverage1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double max = 0, sum = 0;

        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = scan.nextDouble();
            if (scores[i] > max) {
                max = scores[i];
            }
            sum += scores[i];
        }

//        for (int i = 0; i < n; i++) {
//            scores[i] = scores[i]/max*100;
//            sum += scores[i];
//        }
//
//
//        System.out.println(sum/n);

        System.out.println((sum/max)*100 / n);
        scan.close();

    }
}
