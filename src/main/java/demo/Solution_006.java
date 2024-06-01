package demo;

/**
 * 求斐波那契数列第N项值
 *
 */
public class Solution_006 {

    public int Fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int res = new Solution_006().Fibonacci(3);
        System.out.println(res);
    }
}
