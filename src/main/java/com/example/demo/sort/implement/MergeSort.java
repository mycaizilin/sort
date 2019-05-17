package com.example.demo.sort.implement;

import java.util.Arrays;

/**
 * @Author: CaiZiLin
 * @Date: 2019/5/14 19:45
 * 归并排序，将列表通过递归的方式拆到每个列表只有一个元素，再一层层合并成有序列表
 * 递归拆分再合并看起来有点绕，不过这种递归用法很有参考意义
 * 两个有序数组再合并成一个有序数组的做法也是非常值得学习
 */
public class MergeSort {
    public static int[] sort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);
        int length = array.length;
        if (length == 1) {
            return array;
        }
        int middle = (int) Math.floor(length / 2);

        int[] leftArray = Arrays.copyOfRange(sourceArray, 0, middle);
        int[] rightArray = Arrays.copyOfRange(sourceArray, middle, length);

        return merge(sort(leftArray), sort(rightArray));
    }

    static int[] merge(int[] leftArray, int[] rightArray) {
        int[] array = new int[leftArray.length + rightArray.length];
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
        return array;
    }
}
