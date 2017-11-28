package com.wp.jvm.imitateOom;

import java.util.LinkedList;

/**
 * @author 王萍
 * @date 2017/11/28 0028
 */
public class HeapOom {

    public static void main(String[] args) {
        LinkedList<TestObject> list = new LinkedList<>();
        while (true) {
            list.add(new TestObject());
        }
    }
}

class TestObject {
    //注释掉下面代码会输出 java.lang.OutOfMemoryError: GC overhead limit exceeded
    // 不注释输出为java.lang.OutOfMemoryError: Java heap space
    private byte[] bytes = new byte[1024];
}