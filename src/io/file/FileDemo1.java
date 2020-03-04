package io.file;

import java.io.File;

/**
 * 打印目录
 */
public class FileDemo1 {
    public static void main(String[] args) {
        File f = new File("E:\\a");
        printTree(f, 0);
    }

    public static void printTree(File f, int level){
        for (int j=0; j<level; j++){
            System.out.print("\t");
        }
        System.out.println(f.getAbsolutePath());
        if (f.isDirectory()){
            level++;
            File[] strs = f.listFiles();
            for (int i=0; i<strs.length; i++){
                File f0 = strs[i];
                printTree(f0, level+1);
            }
        }
    }
}
