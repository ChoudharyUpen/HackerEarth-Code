import java.util.*;

class TestClass {

    static long nCr(long n, long r) {
        if (r < 0 || r > n) return 0;

        r = Math.min(r, n - r);

        long ans = 1;

        for (long i = 1; i <= r; i++) {
            ans = ans * (n - r + i) / i;
        }

        return ans;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long sumA = 0;
        long sumB = 0;

        int x = 0;
        int y = 0;

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();

            if (v == -1)
                x++;
            else
                sumA += v;
        }

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();

            if (v == -1)
                y++;
            else
                sumB += v;
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
