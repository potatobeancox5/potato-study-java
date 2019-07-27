package com.potato.study.arrays.demo;

import java.util.Arrays;

/**
 * Arrays 类使用案例
 */
public class ArraysDemo {

    public static void main(String[] args) {

        int[] arr = new int[]{1,6,3,2};

        // 排序
        Arrays.sort(arr);
        // 数组 -> 字符串
        System.out.println(Arrays.toString(arr));

    }
}
