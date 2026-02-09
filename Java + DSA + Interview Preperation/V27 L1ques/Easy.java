
public class Easy {
    public static void main(String[] args) {
        int n = 59008;
        // fun(n);
        // System.out.println(fact(5));
        // System.out.println(sumofdigits(n));
        // reverse(n);
        // System.out.println(sum);
        // System.out.println(reverse2(n));
        System.out.println(count(n));

    }

    static void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

    static int fact(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return n * fact(n - 1);
    }

    static int sumofdigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) + sumofdigits(n / 10);
    }

    static int sum = 0;

    static void reverse(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse(n / 10);
    }

    static int reverse2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }

    static int count(int n) {
        return helper1(n, 0);
    }

    private static int helper1(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0)
            return helper1(n / 10, c + 1);
        return helper1(n / 10, c);

    }
}