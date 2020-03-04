package cn.tx;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileDemo1 {
    static int length = 0;

    public static void main(String[] args) throws IOException {
        File fp1 = new File("C:\\Users");
        method(fp1);
    }

    public static void method(File fp) {
        if(fp==null||!fp.exists())return;
        File[] files = fp.listFiles();
        length++;//进入下一层
        for (File file : files) {
            for (int i = 0; i <length ; i++) {
                System.out.print("\t");
            }
            if (file.isDirectory() == true) {
                System.out.println(file.getName());
                method(file);
            } else {
                System.out.println(file.getName());
            }
        }
        length--;//退回上一层
    }
}



