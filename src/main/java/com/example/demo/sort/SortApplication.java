package com.example.demo.sort;


import com.example.demo.sort.implement.*;

import java.util.Random;

public class SortApplication {

    public static void main(String[] args) {
        Random random =new Random();
        int[]  array=new int[10];
        for (int i=0;i<10;i++){
            array[i]=random.nextInt(100);
        }
        System.out.println("排序前");
        for (int i=0;i<10;i++){
            System.out.println(array[i]);
        }
        int[] sortArray= HeapSort.sort(array);
        System.out.println("排序后");
        for (int i=0;i<10;i++){
            System.out.println(sortArray[i]);
        }
      //  testSortTime();
    }

    static void  testSortTime(){
        Random random =new Random();

        int length=10000;
        int[]  array=new int[length];
        for (int i=0;i<length;i++){
            array[i]=random.nextInt(length);
        }

        long start= System.currentTimeMillis();
        InsertSort.sort(array);
        long end= System.currentTimeMillis();
        System.out.println(String.format("插入排序:%s",end-start));

        start= System.currentTimeMillis();
        ShellSort.sort(array);
        end= System.currentTimeMillis();
        System.out.println(String.format("希尔排序:%s",end-start));

        start= System.currentTimeMillis();
        BubbleSort.sort(array);
        end= System.currentTimeMillis();
        System.out.println(String.format("冒泡排序:%s",end-start));

        start= System.currentTimeMillis();
        SelectSort.sort(array);
        end= System.currentTimeMillis();
        System.out.println(String.format("选择排序:%s",end-start));

        start= System.currentTimeMillis();
        MergeSort.sort(array);
        end= System.currentTimeMillis();
        System.out.println(String.format("归并排序:%s",end-start));

        start= System.currentTimeMillis();
        QuickSort.sort(array);
        end= System.currentTimeMillis();
        System.out.println(String.format("快速排序:%s",end-start));

        start= System.currentTimeMillis();
        HeapSort.sort(array);
        end= System.currentTimeMillis();
        System.out.println(String.format("堆排序:%s",end-start));
    }


}
