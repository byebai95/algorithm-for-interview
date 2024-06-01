package demo;

/**
 * 求斐波那契数列前N项和
 *
 */
public class Solution_007 {

    public int FibonacciSum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += Fibonacci(i);
        }
        return result;
    }

    protected int Fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int res = new Solution_007().FibonacciSum(3);
        System.out.println(res);
    }
}
