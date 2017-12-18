package com.wp.jvm.lock;

/**
 * @author 王萍
 * @date 2017/12/18 0018
 */

/**
 * 先使用jps找到当前jvm的进程id，然后jstack -l jvmid,会出现threaddump文件。
 */
public class DeadLock {

    public static Object resource1 = new Object();
    public static Object resource2 = new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                synchronized (resource1) {
                    try {
                        Thread.sleep(1000);
                        synchronized (resource2) {
                            System.out.println("thread1");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"线程1").start();
        new Thread(new Runnable() {
            public void run() {
                synchronized (resource2) {
                    try {
                        Thread.sleep(1000);
                        synchronized (resource1) {
                            System.out.println("thread2");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"线程2").start();
    }
}
