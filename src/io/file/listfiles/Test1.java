package io.file.listfiles;

import java.io.File;

/**
 * 列出一个目录下所有的文件
 */
public class Test1 {
    public static void main(String[] args) {
        File file = new File("E:\\a");
        File[] files = file.listFiles();
        for (File f : files){
            if (f.isFile()){
                System.out.println(f.getName());
            }
        }
    }
}
