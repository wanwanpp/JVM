package com.wp.jvm.btrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 王萍 on 2017/2/21 0021.
 */
public class BTraceTest1 {

    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) throws IOException {
        BTraceTest1 test = new BTraceTest1();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0;i<10;i++){
            reader.readLine();
            int a = (int) Math.round(Math.random()*1000);
            int b = (int) Math.round(Math.random()*1000);
            System.out.println(test.add(a,b));

        }
    }
}
