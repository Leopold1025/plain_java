package io.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 使用过滤器找某个文件夹下的txt文件
 */
public class FileDemo2 {
    public static void main(String[] args) {
        File file = new File("E:\\a");
        if (file.isDirectory()){
            String[] list = file.list(new FilenameFilterbytxt());
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

    static class FilenameFilterbytxt implements FilenameFilter{
        @Override
        public boolean accept(File dir, String name) {
            return name.endsWith(".txt");
        }
    }
}
