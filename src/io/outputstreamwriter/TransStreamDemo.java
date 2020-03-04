package io.outputstreamwriter;

import java.io.*;

public class TransStreamDemo {
    public static void main(String[] args) throws IOException {
        writeCN();
        readCN();
    }

    public static void readCN() throws IOException {
        //InputStreamReader将字节数组使用指定的编码表解码成文字
        InputStreamReader isr = new InputStreamReader(new FileInputStream("temp.txt"), "utf-8");
        char[] buff = new char[1024];
        int len = isr.read(buff);
        System.out.println(new String(buff, 0, len));
        isr.close();
    }

    public static void writeCN() throws IOException {
        //OutputStreamWriter将字符串按照指定的编码表转成字节，再使用字符流将这些字节写出去
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("temp.txt"), "utf-8");
        osw.write("我爱编程");
        osw.close();
    }
}
