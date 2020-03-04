package io.countwordinfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数
 */
public final class MyUtil {

    //工具类中的方法都是静态方式访问的因此将构造器私有不允许创建对象(绝对好习惯)
    private MyUtil(){
        throw new AssertionError();
    }

    public static int countWordInFile(String filename, String word){
        int counter = 0;
        try(FileReader fr = new FileReader(filename)) {
            try(BufferedReader br = new BufferedReader(fr)) {
                String line = null;
                while ((line = br.readLine()) != null){
                    int index = -1;
                    while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0){
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return counter;
    }

    public static void main(String[] args) {
        String filename = "copy.java";
        String word = "my";
        int i = MyUtil.countWordInFile(filename, word);
        System.out.println(word + "在" + filename + "中出现的次数为：" + i);
    }
}
