package cn.tx;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File fp=new File("C:\\Users\\Administrator\\Desktop\\学生作业");

        File fp1 =new File(fp,"8/aaa/bbb/ccc/ddd/das.xlsx");
        boolean mkdir = fp1.mkdir();
        System.out.println(mkdir);

        boolean bbb = fp1.delete();
        System.out.println(bbb);


    }
}
