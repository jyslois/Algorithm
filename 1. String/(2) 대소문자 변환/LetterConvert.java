import java.util.Scanner;

public class LetterConvert {
    public static String convert(String sen) {
        String result = "";
        for (char c : sen.toCharArray()) {
            if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            result += c;
        }

        return result;

//        // 아스키넘버로 풀기: 대문자(65-90), 소문자(97-122): 소문자에서 -32하면 대문자가 된다.
//        for (char c: sen.toCharArray()) {
//            if (c >= 65 && c <= 90) { // 대문자이면
//                c = (char) (c + 32);
//            } else if (c >= 97 || c <= 122) {
//                c = (char) (c - 32);
//            }
//            result += c;
//        }
//        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sen = scan.nextLine();
        System.out.println(convert(sen));
    }
}
