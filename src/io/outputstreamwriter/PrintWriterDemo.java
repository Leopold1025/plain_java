package io.outputstreamwriter;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws IOException {
        PrintWriter pw =  new PrintWriter(new FileWriter("print.txt"), true);
        pw.write("测试打印流   ");
        pw.println("此句之后换行");
        pw.println("特有功能：自动换行和自动刷新");
        pw.println("利用构造器设置自动刷新");
        pw.close();
    }
}
