package com.wp.jvm.btrace;

import java.util.Random;

//参考博文    http://learnworld.iteye.com/blog/1402763



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
