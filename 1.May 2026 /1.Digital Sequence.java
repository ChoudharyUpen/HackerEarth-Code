Pseudo Code Most important code of this program to revise




import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);

        int y = s.nextInt();

        int arr[] = new int[y];

        // Input array
        for (int i = 0; i < y; i++) {
            arr[i] = s.nextInt();
        }

        // Count of digits 0-9
        int digitCount[] = new int[10];

        // Process each number
        for (int i = 0; i < y; i++) {

            int num = arr[i];

            // To avoid counting same digit multiple times
            boolean visited[] = new boolean[10];

            // Special case for 0
            if (num == 0) {
                digitCount[0]++;
            }

            while (num > 0) {

                int digit = num % 10;

                if (!visited[digit]) {
                    digitCount[digit]++;
                    visited[digit] = true;
                }

                num = num / 10;
            }
        }

        // Find maximum count
        int ans = 0;

        for (int i = 0; i < 10; i++) {
            ans = Math.max(ans, digitCount[i]);
        }

        System.out.println(ans);
    }
}
