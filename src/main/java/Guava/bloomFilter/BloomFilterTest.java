/*
 * Copyright (c) 2021 maoyan.com
 * All rights reserved.
 *
 */
package Guava.bloomFilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.StandardCharsets;

/**
 * 布隆过滤器测试
 *
 * @author chenhang
 * @created 2021/2/27
 */
public class BloomFilterTest {
    public static void main(String[] args) {
        // 布隆过滤器初始化
        BloomFilter<String> bloomFilter = BloomFilter.create(Funnels.stringFunnel(StandardCharsets.UTF_8), 10000, 0.01);
        for (int i = 1; i <= 10000; i++) {
            bloomFilter.put(String.valueOf(i));
        }
        // 计数器
        int count = 0;
        for (int i = 1; i <= 10000; i++) {
            if (!bloomFilter.mightContain(String.valueOf(i))) {
                System.out.println("[error] i = " + i + " 判断为不存在");
                count++;
            }
        }
        System.out.println("【error】布隆过滤器错误数: count = " + count);
        count = 0;
        for (int i = 10001; i <= 20000; i++) {
            if (bloomFilter.mightContain(String.valueOf(i))) {
                System.out.println("[warn] 布隆过滤器误判 i = " + i);
                count++;
            }
        }
        System.out.println("【warn】布隆过滤器误判数量: count = " + count + " 误判率: " + (count * 1.0 / 10000 * 100) + "%");
    }
}