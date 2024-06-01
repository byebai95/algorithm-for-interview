package demo;

import java.util.Arrays;

/**
 * 归并排序
 */
public class Solution_002 {

    public int[] sort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return mergeSort(sort(left), sort(right));
    }


    // 合并2个有序数组
    public int[] mergeSort(int[] arr1, int[] arr2) {
        int i = arr1.length, j = arr2.length;
        int k = 0, iIndex = 0, jIndex = 0;
        int[] result = new int[i + j];

        while (i != 0 && j != 0) {
            if (arr1[iIndex] < arr2[jIndex]) {
                result[k++] = arr1[iIndex++];
                i--;
            } else {
                result[k++] = arr2[jIndex++];
                j--;
            }
        }

        while (i != 0) {
            result[k++] = arr1[iIndex++];
            i--;
        }

        while (j != 0) {
            result[k++] = arr2[jIndex++];
            j--;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 8, 4, 7, 6, 9};
        int[] result = new Solution_002().sort(arr);
        System.out.println(Arrays.toString(result));

//        int[] arr1 = new int[]{1, 2, 4};
//        int[] arr2 = new int[]{2, 5};
//        int[] res = new MergeSort().mergeSort(arr1, arr2);
//        System.out.println(Arrays.toString(res));
    }
}
