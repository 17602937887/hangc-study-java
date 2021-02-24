/*
 * Copyright (c) 2021 hangcc.cn
 * All rights reserved.
 *
 */
package DesignPattern.singleton;

/**
 * 饿汉式单例
 *
 * @author chenhang
 * @created 2021/2/24
 * 优点: 多线程场景下不会出现线程安全问题
 * 缺点: 如果没有使用 会造成资源浪费
 */
public class HungrySingleton {
    /**
     * 类加载过程就进行实例化
     */
    private final static HungrySingleton instance = new HungrySingleton();

    /**
     * 构造函数私有化 保证外部无法创建该类的实例
     */
    private HungrySingleton() {}

    /**
     * 提供全局访问点 放回该类的唯一实例
     * @return instance
     */
    public static HungrySingleton getInstance() {
        return instance;
    }

    public void method() {
        System.out.println("该方法只能被对象访问到,类无法访问.");
    }
}