package demo;

import java.util.Arrays;

/**
 * 求字符串数组中，最长的公共前缀子串
 */
public class Solution_008 {


    public String longestCommonPrefix(String[] strs) {
        //按照字典序排序之后比较字典序最小的子串和字典序最大的子串的相同部分，得到的最长公共前缀就是所有字符串的最长公共前缀
        int len = strs.length;
        if (len == 0) return "";
        Arrays.sort(strs);
        //枚举第一个最小的子串和最后一个最大的子串
        int i = 0;
        String a = strs[0];
        String b = strs[len - 1];
        for (i = 0; i < a.length() && a.charAt(i) == b.charAt(i); i++) ;
        return a.substring(0, i);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"abc", "abd", "acd"};
        String res = new Solution_008().longestCommonPrefix(strs);
        System.out.println(res);
    }
}
