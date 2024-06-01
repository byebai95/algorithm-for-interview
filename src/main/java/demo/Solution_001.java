package demo;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class Solution_001 {

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 测试
        int[] arr = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        new Solution_001().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
