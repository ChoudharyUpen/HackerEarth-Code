import java.io.*;

public class TestClass {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int n = s.length();

        int balance = 0;
        int minPrefix = Integer.MAX_VALUE;

        // Find minimum prefix sum
        for (int i = 0; i < n; i++) {
            balance += (s.charAt(i) == '(') ? 1 : -1;
            minPrefix = Math.min(minPrefix, balance);
        }

        // If total balance is not zero, no rotation can be valid
        if (balance != 0) {
            System.out.println(0);
            return;
        }

        int count = 0;
        balance = 0;

        // Count occurrences of minimum prefix sum
        for (int i = 0; i < n; i++) {
            balance += (s.charAt(i) == '(') ? 1 : -1;
            if (balance == minPrefix) {
                count++;
            }
        }

        System.out.println(count);
    }
}

        if (x > 0 && y > 0) {
            System.out.println("Infinite");
            return;
        }

        if (x == 0 && y == 0) {
            System.out.println(sumA == sumB ? 1 : 0);
            return;
        }

        if (x > 0) {

            long D = sumB - sumA;

            if (D < 0)
                System.out.println(0);
            else
                System.out.println(nCr(D + x - 1, x - 1));
        } else {

            long D = sumA - sumB;

            if (D < 0)
                System.out.println(0);
            else
                System.out.println(nCr(D + y - 1, y - 1));
        }
    }
              }
