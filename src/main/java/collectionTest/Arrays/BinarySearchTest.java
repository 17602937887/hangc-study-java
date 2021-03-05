/*
 * Copyright (c) 2021 maoyan.com
 * All rights reserved.
 *
 */
package collectionTest.Arrays;

import java.util.Arrays;
import java.util.Collections;

/**
 * Arrays.binarySearch()
 * Collections.binarySearch()
 * 如果待查找的元素在数组中则返回其下标(如果存在多个 则随便返回其中一个)
 * 如果元素不存在与该数组中，则返回 (-(插入的位置) - 1)的相反数 所以我们可以对返回值 + 1 取abs得到的插入位置
 *
 *
 * @author chenhang
 * @created 2021/3/4
 */
public class BinarySearchTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 9, 14};
        System.out.println(Arrays.binarySearch(arr, 0));
        System.out.println(Arrays.binarySearch(arr, 1));
        System.out.println(Arrays.binarySearch(arr, 2));
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 20));
    }
}