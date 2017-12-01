package com.wp.jvm.compile;

import org.gjt.jclasslib.io.ClassFileWriter;
import org.gjt.jclasslib.structures.CPInfo;
import org.gjt.jclasslib.structures.ClassFile;
import org.gjt.jclasslib.structures.constants.ConstantIntegerInfo;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
public class Test {
    public static void main(String[] args) throws Exception {  
  
        String filePath = "E:\\download\\ExpService.class";  
        FileInputStream fis = new FileInputStream(filePath);
  
        DataInput di = new DataInputStream(fis);
        ClassFile cf = new ClassFile();  
        cf.read(di);  
          
        CPInfo[] infos = cf.getConstantPool();  
  
        int count = infos.length;  
        System.out.println(count);  
          
        for (int i = 0; i < count; i++) {  
            if (infos[i] != null) {  
                System.out.print(i);  
                System.out.print(" = ");  
                System.out.print(infos[i].getVerbose());  
                System.out.print(" = ");  
                System.out.println(infos[i].getTagVerbose());  
                if (i == 10) {  
                    //ConstantUtf8Info uInfo = (ConstantUtf8Info)infos[i];  
                    //uInfo.setBytes("400".getBytes());               
                    ConstantIntegerInfo uInfo=(ConstantIntegerInfo) infos[i];  
                    uInfo.setInt(400);;  
                    infos[i] = uInfo;  
                }  
            }  
        }  
          
        cf.setConstantPool(infos);  
        fis.close();  
        File f = new File(filePath);
        ClassFileWriter.writeToFile(f, cf);  
    }  
}  
