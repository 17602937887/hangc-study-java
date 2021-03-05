/*
 * Copyright (c) 2021 maoyan.com
 * All rights reserved.
 *
 */
package collectionTest.Arrays;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 在这里编写类的功能描述
 *
 * @author chenhang
 * @created 2021/3/5
 */
public class ListsPartitionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            list.add(i + 1);
        }
        List<List<Integer>> partition = Lists.partition(list, 10);
        for (List<Integer> arr : partition) {
            for (Integer val : arr) {
                System.out.print(val + ", ");
            }
            System.out.println();
        }
    }
}