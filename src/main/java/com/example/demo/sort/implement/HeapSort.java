package com.example.demo.sort.implement;

import java.util.Arrays;

/**
 * @Author: CaiZiLin
 * @Date: 2019/5/16 9:55
 * 堆排序,每一个数组都可以看成一颗完全二叉树,特点是每一个非叶子节点i,左子节点在数组的2i+1位置上,右节点在2i+2位置。
 * 而堆也是完全二叉树的一种，堆的特点是每一个父节点都大于等于子节点，所以在根节点的元素就是数组的最大值
 * 所以堆排序的思路就是，将原始数组看成一颗普通二叉树调整成堆，位置i=0的就是最大值，然后交换到数组末（i=length-1）位置上。
 * 第二次是将0~倒数第二位置（i=length-2）看成一颗普通二叉树调整成堆，将i=0和i=length-2交换位置。
 * 重复上述步骤，直到i=0。
 * 调整成堆的思路是，末尾节点的父节点就是最后一个非叶子节点i，位置小于i的节点也都是非叶子节点，所以逐个非叶子节点和子节点比较，交换最大值。直到根节点就是最大堆了
 */
public class HeapSort {

    public static int[] sort(int[] sourceArray) {
        int[] array = Arrays.copyOf(sourceArray, sourceArray.length);

        for (int i = array.length - 1; i > 0; i--) {
            buildMaxHeap(array, i);
            swap(array, 0, i);
        }
        return array;
    }

    static void buildMaxHeap(int[] array, int lastLeaf) {
        //计算最后一个非叶子节点的位置
        int lastNonLeaf;
        if (lastLeaf % 2 == 1) {
            lastNonLeaf = (lastLeaf - 1) / 2;
        } else {
            lastNonLeaf = lastLeaf / 2 - 1;
        }
        for (int i = lastNonLeaf; i >= 0; i--) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if (array[left] > array[i]) {
                swap(array, left, i);
            }
            if (right <= lastLeaf && array[right] > array[i]) {
                swap(array, right, i);
            }
        }
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
