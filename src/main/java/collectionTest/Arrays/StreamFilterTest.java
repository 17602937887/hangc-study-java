/*
 * Copyright (c) 2021 maoyan.com
 * All rights reserved.
 *
 */
package collectionTest.Arrays;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 在这里编写类的功能描述
 *
 * @author chenhang
 * @created 2021/3/5
 */
public class StreamFilterTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("张三", 12, "男"));
        list.add(new Student("张三", 13, "男"));
        list.add(new Student("张三", 14, "男"));
        list.add(new Student("张三", 15, "男"));
        list.add(new Student("张三", 16, "男"));
        list.add(new Student("张三", 17, "男"));
        list.add(new Student("李四", 15, "女"));
        Map<String, Student> collect = list.stream().collect(Collectors.toMap(Student::getName, Function.identity(), (c1, c2) -> c2));
        for (String name : collect.keySet()) {
            System.out.println("key = " + name + " val = " + collect.get(name));
        }
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Student {
    private String name;
    private Integer age;
    private String gender;
}
