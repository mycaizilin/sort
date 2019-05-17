package com.example.demo.sort.implement;

import java.util.Arrays;

/**
 * @Author: CaiZiLin
 * @Date: 2019/5/14 15:23
 * 希尔排序,是插入排序算法的加强版。
 * 第一次利用步长gap将列表分组，再用插入排序将各小组排序。第二次利用步长gap/2分组和插入排序....
 * 直到步长gap=1时,分组数量只有1个,进行最后插入排序
 */
public class ShellSort {
    public static int[] sort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        int gap = array.length/2;
        while (gap >= 1) {
            for (int i = gap; i< array.length; i++) {
                int tmp = array[i];
                int index = i;
                for (int j = i-gap; j >= 0; j = j - gap) {
                    if (tmp < array[j]) {
                        array[j + gap] = array[j];
                        index = j;
                    } else {
                        break;
                    }
                }
                array[index] = tmp;
            }
            gap = gap / 2;
        }
        return array;
    }
}
