
import java.util.*;

class TestClass {

    static boolean isValid(String str) {

        int balance = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '(') {
                balance++;
            } else {
                balance--;
            }

            if (balance < 0) {
                return false;
            }
        }

        return balance == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int n = s.length();
        int count = 0;

        for (int i = 0; i < n; i++) {

            String rotated =
                    s.substring(i) + s.substring(0, i);

            if (isValid(rotated)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
