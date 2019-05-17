package com.example.demo.sort.implement;

import java.util.Arrays;

/**
 * @Author: CaiZiLin
 * @Date: 2019/5/13 18:41
 * 插入排序,总体思路是将数组分成有序和无序两虚拟集合。
 * 先假设前i个值是有序的,用第i+1个值从有序集合的末尾开始依次比较大小,如果较小,被比较值往后挪一位,记下当前位置,否者结束内循环,插入第i个值。
 */
public class InsertSort {
    public static int[] sort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int tmp = array[i];
            int index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (tmp < array[j]) {
                    array[j + 1] = array[j];
                    index = j;
                } else {
                    break;
                }
            }
            array[index] = tmp;
        }
        return array;
    }
}
