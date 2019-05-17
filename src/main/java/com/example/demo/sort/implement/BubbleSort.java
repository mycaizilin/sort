package com.example.demo.sort.implement;

import java.util.Arrays;

/**
 * @Author: CaiZiLin
 * @Date: 2019/5/13 15:59
 * 冒泡排序,比较符合语义的思路是:有i个元素,外循环i次,第一遍内循环将最小的元素交换到i=0位置,第二遍内循环将次最小值交换到i=1位置.........
 */
public class BubbleSort {
    public static int[] sort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
            }
        }
        return array;
    }
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
