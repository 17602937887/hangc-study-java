/*
 * Copyright (c) 2021 hangcc.cn
 * All rights reserved.
 *
 */
package Guava.trafficControl;

import java.util.concurrent.Semaphore;

/**
 * 在这里编写类的功能描述
 *
 * @author chenhang
 * @created 2021/2/24
 */
public class SemaphoreTest {
    public static void main(String[] args) {
        Test t = new Test();
        for (int i = 0; i < 5; i++) {
            final String threadName = "线程" + (i + 1);
            new Thread(() -> {
                t.print();
            }, threadName).start();
        }
    }
}

class Test {
    private static final Semaphore sp = new Semaphore(3);

    public void print() {
        try {
            sp.acquire();
            System.out.println(Thread.currentThread().getName()+" started: "+sp.availablePermits());
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sp.release();
            System.out.println(Thread.currentThread().getName()+" released: "+sp.availablePermits());
        }
    }
}