/*
 * Copyright (c) 2021 maoyan.com
 * All rights reserved.
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 在这里编写类的功能描述
 *
 * @author chenhang
 * @created 2021/3/2
 */
public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        List<Integer> arr1 = new ArrayList<>(600000);
        List<Integer> arr2 = new ArrayList<>(130000);
        Random random = new Random();
        for (int i = 0; i < 600000; i++) {
            arr1.add(random.nextInt(10000000));
        }
        for (int i = 0; i < 130000; i++) {
            arr2.add(random.nextInt(10000000));
        }
        System.out.println("arr1.size() = " + arr1.size());
        System.out.println("arr2.size() = " + arr2.size());
        System.out.println("=========任务开始执行=========");
        long time1 = System.currentTimeMillis();
        // Collections.sort(arr2);
        System.out.println("排序耗时: " + (System.currentTimeMillis() - time1));
        int count = 0;
        for (int val : arr1) {
            if (arr2.contains(val)) {
                count++;
            }
        }
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println("count = " + count);
    }
}