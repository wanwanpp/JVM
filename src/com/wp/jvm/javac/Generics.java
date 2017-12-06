package com.wp.jvm.javac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generics {

    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("wanwanpp", "123456");
        System.out.println(hashMap.get("wanwanpp"));

        //查看对应的class反编译文件，可看出遍历循环等语法糖。
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (int i : list) {      //本质是迭代器iterator
            System.out.println(i);
        }
    }
}
