package com.wp.jvm.javac;
//http://www.importnew.com/18346.html
//�Զ�װ������䣬�ɲ鿴class��������java�ļ��ο���
public class IntegerWrapper {
    public static void main(String[] args) {
 
        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        Long g = 3L;
        Long h = 2L;
        //'=='���ߵ�c��d����������Ƚ������Ƿ���ȣ���Ϊ3��-128��127֮�䣬�ὫInteger������ǰ��������
        //Integer c = 3;ʵ������Integer c = Integer.valueOf(3); valueOf�������IntegerCache�з��غ��ʵ�Integer����ֵ��-128��127֮��ġ�
        //���c��d��ָ�򻺴���Ǹ�Integer��
        System.out.println(c==d);  //true
        System.out.println(e==f);   //false
//        a+bΪ���ʽ�����ԱȽϵ���c��a+b��ֵ
        System.out.println(c==(a+b));  //true
        //��a��b���䣬Ȼ����ӣ���װ��ΪInteger������Integer��equals����Ƚϡ�
        System.out.println(c.equals(a+b));//true
        System.out.println(g==(a+b));  //true���Ƚ���ֵ
        System.out.println(g.equals(a+b));//false��   �Ƚ����ã�gΪLong���ұ�a+bװ���ΪInteger��
        System.out.println(g.equals(a+h));//true       �Ƚ����ã�gΪLong���ұ�a+bװ���ΪLong��
    }
}