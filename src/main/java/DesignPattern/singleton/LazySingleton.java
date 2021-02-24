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
 * 优点: 延迟加载 当外部方法调用getInstance方法时才会创建实例
 * 缺点: 多线程场景下 需要用synchronized关键字保证线程安全 会有阻塞时间及锁资源的占用
 */
public class LazySingleton {
    /**
     * 懒汉式单例 最终返回的实例
     */
    private static volatile LazySingleton instance = null;

    /**
     * 构造函数私有化 保证外部方法无法new实例出来
     */
    private LazySingleton() {};

    /**
     * 全局访问点
     * @return 单例的实例
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    public void method() {
        System.out.println("单例对象调用方法, 类是不可以调用该方法的.");
    }
}