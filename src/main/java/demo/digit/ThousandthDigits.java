package demo.digit;

/**
 * 给定一个数字，返回带有千分位逗号的字符串
 * 输入 1234
 * 输出 1,234
 */
public class ThousandthDigits {

    public String thousandthDigits(int number) {
        StringBuilder originStr = new StringBuilder(String.valueOf(number)).reverse();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < originStr.length(); i++) {
            result.append(originStr.charAt(i));
            if ((i + 1) % 3 == 0) {
                result.append(",");
            }
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        int number = 0;
        String result = new ThousandthDigits().thousandthDigits(number);
        System.out.println(result);

    }
}
