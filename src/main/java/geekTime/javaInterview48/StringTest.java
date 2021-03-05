/*
 * Copyright (c) 2021 maoyan.com
 * All rights reserved.
 *
 */
package geekTime.javaInterview48;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.UUID;

/**
 * 在这里编写类的功能描述
 *
 * @author chenhang
 * @created 2021/2/27
 */
public class StringTest {
    public static void main(String[] args) {

        String context = String.format("性别占比%.1f%%女%.1f%%男，了解详情>>", 11.3D, 88.7D);
        System.out.println(context);

        String str = Integer.valueOf(12345).toString();
        System.out.println(str == "12345");
        String str2 = str.intern();
        System.out.println(str == "12345");
        System.out.println(str2 == "12345");

        String s1 = "JavaEE";
        String s2 = "hadoop";

        String s3 = "JavaEEhadoop";
        String s5 = s1 + "hadoop";
        String s6 = "JavaEE" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println(s6 == s7);

        String s8 = s6.intern();
        System.out.println(s6 == s8);
        System.out.println(s3 == s8);
    }
}