package com.wp.jvm.btrace;

public class Counter {
    // 总数  
    private static int totalCount = 0;  
  
    public int add(int num) throws Exception {  
        totalCount += num;  
        sleep();  
        return totalCount;  
    }  
      
    public void sleep() throws Exception {  
        Thread.sleep(1000);  
    }  
  
}  