package com.wp.jvm.javac;
//http://www.importnew.com/18346.html
//自动装箱与拆箱，可查看class反编译后的java文件参考。
public class Wrapper {
    public static void main(String[] args) {
 
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;
 
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));
        System.out.println(g.equals(a+h));
    }
}