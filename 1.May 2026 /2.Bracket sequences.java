import java.io.*;

public class TestClass {

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int n = s.length();

        int balance = 0;
        int minPrefix = Integer.MAX_VALUE;

        // Find minimum prefix sum
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(')
                balance++;
            else
                balance--;

            minPrefix = Math.min(minPrefix, balance);
        }

        // Total balance must be zero
        if (balance != 0) {
            System.out.println(0);
            return;
        }

        balance = 0;
        int count = 0;

        // Count occurrences of minimum prefix
        for (int i = 0; i < n; i++) {

            if (s.charAt(i) == '(')
                balance++;
            else
                balance--;

            if (balance == minPrefix)
                count++;
        }

        System.out.println(count);
    }
}
