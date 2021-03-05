/*
 * Copyright (c) 2021 hangcc.cn
 * All rights reserved.
 *
 */
package Guava.trafficControl;

import com.google.common.util.concurrent.RateLimiter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Guava RateLimiter限流测试
 *
 * @author chenhang
 * @created 2021/2/24
 */
public class RateLimiterConsumerTest {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(i);
        }
        final RateLimiter rt = RateLimiter.create(1.0);
        for (int i = 0; i < arr.size(); i++) {
            final int tmp = i;
            pool.submit(() -> {
                rt.acquire(1);
                consumer(tmp);
            });
        }
        pool.shutdown();
    }

    public static void consumer(int val) {
        System.out.println("threadName = " + Thread.currentThread().getName() + "  |  time = " + LocalDateTime.now().toLocalTime().getSecond() + " val = " + val);
    }
}
