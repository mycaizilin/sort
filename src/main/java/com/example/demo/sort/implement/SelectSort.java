package com.example.demo.sort.implement;

import java.util.Arrays;

/**
 * @Author: CaiZiLin
 * @Date: 2019/5/13 17:36
 * 选择排序,先为i=0的位置选出最小值(假定i=0是最小值,依次和下面比较,记下较小值的下标,最后和i=0位置交换),依次为i=1选出最小值.....
 */
public class SelectSort {
    public static int[] sort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        int length = array.length;
        for (int i = 0; i < length-1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            swap(array,i,min);
        }
        return array;
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
