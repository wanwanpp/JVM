package com.wp.jvm.imitateOom;

/**
 * @author 王萍
 * @date 2017/11/28 0028
 *  VM options:-Xss108k    设置线程对应的栈空间大小，当前版本JVM8最小为108k
 */
public class StackOverFlow {

    private int length = 0;

    public void recursion() {
        length++;
        recursion();
    }

    public static void main(String[] args) {
        StackOverFlow stackOverFlow = new StackOverFlow();
        try {
            stackOverFlow.recursion();
        } catch (Throwable e) {
            System.out.println("stack length is : " + stackOverFlow.length);
            throw e;
        }
    }
}


