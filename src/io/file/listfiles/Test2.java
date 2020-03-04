package io.file.listfiles;

import java.io.File;

/**
 * 列出一个目录下所有的文件(包含子目录下的所有文件)
 */
public class Test2 {
    public static void main(String[] args) {
        File file = new File("E:\\a");
        showDirectory(file);
    }

    public static void showDirectory(File f){
        _walkDirectory(f, 0);
    }

    public static void _walkDirectory(File f, int level){
        if (f.isDirectory()){
            File[] files = f.listFiles();
            for (File temp : files){
                _walkDirectory(temp, level + 1);       //递归
            }
        } else {
            for (int i = 0; i < level - 1; i++){
                System.out.print("\t");
            }
            System.out.println(f.getName());
        }
    }
}
