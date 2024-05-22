package demo.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 输入 [3,2,5,8,4,7,6,9]
 * 输出 [2,3,4,5,6,7,8,9]
 */
public class BubbleSort {

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
        new BubbleSort().bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
