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

        //�鿴��Ӧ��class�������ļ����ɿ�������ѭ�����﷨�ǡ�
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (int i : list) {      //�����ǵ�����iterator
            System.out.println(i);
        }
    }
}
