/*
 * Copyright (c) 2021 hangcc.cn
 * All rights reserved.
 *
 */
package DesignPattern.singleton;

/**
 * 在这里编写类的功能描述
 *
 * @author chenhang
 * @created 2021/2/24
 */
public class Main {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        instance.method();
    }
}