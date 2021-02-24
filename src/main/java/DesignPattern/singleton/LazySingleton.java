/*
 * Copyright (c) 2021 hangcc.cn
 * All rights reserved.
 *
 */
package DesignPattern.singleton;

/**
 * 懒汉式单例
 *
 * @author chenhang
 * @created 2021/2/23
 */
public class LazySingleton {
    // 保证instance在所有线程中同步
    private static volatile LazySingleton instance = null;

    private LazySingleton() {};
}