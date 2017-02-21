package com.wp.jvm;

import java.util.Random;

/**
 * Created by 王萍 on 2017/2/21 0021.
 */
public class BTraceTest2 {

    public static void main(String[] args) throws Exception {
        Random random = new Random();
        Counter counter =new Counter();
        while (true){

            int a = random.nextInt(10);
            System.out.println(a);
            counter.add(a);
            Thread.sleep(1000);
        }
    }
}
