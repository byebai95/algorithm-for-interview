package demo;

/**
 * 反转字符串，单词不反转
 *
 * 输入: Hello World
 * 输出: wORLD hELLO
 *
 */
public class Solution_004 {

    public String resolveString(String s, int n) {
        StringBuilder res = new StringBuilder();
        int index = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ' ') {
                res.append(' ');
                index = res.length();
            } else {
                if (ch >= 'a' && ch <= 'z') {
                    res.insert(index, Character.toUpperCase(ch));
                } else if (ch >= 'A' && ch <= 'Z') {
                    res.insert(index, Character.toLowerCase(ch));
                }

            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str = "Say";
        String result = new Solution_004().resolveString(str, str.length());
        System.out.println(result);
    }
}
