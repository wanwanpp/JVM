package com.wp.jvm.lock;

/**
 * @author ��Ƽ
 * @date 2017/12/18 0018
 */

/**
 * ��ʹ��jps�ҵ���ǰjvm�Ľ���id��Ȼ��jstack -l jvmid,�����threaddump�ļ���
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
        },"�߳�1").start();
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
        },"�߳�2").start();
    }
}
