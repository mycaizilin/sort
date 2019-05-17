package com.example.demo.sort.implement;

import java.util.Arrays;

/**
 * @Author: CaiZiLin
 * @Date: 2019/5/15 10:08
 * 快速排序,总体思路是用第一个元素作为基准,将集合分成三区域,左区域是小于基准的,中间区域只有基准,右区域是大于基准的,这个时候只看三个区域是有序的。
 * 然后用递归的方式同样操作左区域和右区域，最终得到有序集合
 * 划分区域的思路是,先从集合的right开始找到小于基准的A,再从left开始找到大于基准的B,交换AB后,循环上述。直到right等于left。
 * 当right等于left时，right走过的区域都是大于基准的，left走过的区域都是小于基准的（除了第一个位置是基准），这个时候将基准和left位置交换就得到有序的三个区域
 */
public class QuickSort {

    public static int[] sort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        quickSort(array, 0, sourceArray.length - 1);
        return array;
    }

    static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int low = left;
        int high = right;
        int tmp = array[left];

        while (left < right) {
            while (left < right && array[right] >= tmp) {
                right--;
            }
            while (left < right && array[left] <= tmp) {
                left++;
            }
            if (left != right) {
                swap(array, left, right);
            }
        }
        swap(array, low, left);
        quickSort(array, low, left - 1);
        quickSort(array, left + 1, high);
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
