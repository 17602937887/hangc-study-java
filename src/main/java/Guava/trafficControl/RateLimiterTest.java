/*
 * Copyright (c) 2021 hangcc.cn
 * All rights reserved.
 *
 */
package Guava.trafficControl;

import com.google.common.util.concurrent.RateLimiter;

/**
 * 在这里编写类的功能描述
 *
 * @author chenhang
 * @created 2021/2/24
 */
public class RateLimiterTest {
    public static void main(String[] args) {
        TestMethods tm = new TestMethods();
        for(int i=0;i<10;i++){
            new Thread(()->{
                tm.print();
            }).start();
        }
    }
}

class TestMethods {
    public void print(){
        try {
            Constants.rl.acquire();
            System.out.println("Thread: "+Thread.currentThread().getName()+"RateLimiter: "+Constants.rl.getRate());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Constants{
    public static final RateLimiter rl = RateLimiter.create(1.0);
}