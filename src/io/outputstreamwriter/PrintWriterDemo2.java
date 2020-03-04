package io.outputstreamwriter;

import java.io.*;

/**
 * 使用打印流复制文本文件
 */
public class PrintWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //输入流对象
        BufferedReader br = new BufferedReader(new FileReader("copy.java"));
        //输出流对象
        PrintWriter pw = new PrintWriter("printCopy.java");
        String line;
        while ((line = br.readLine()) != null){
            pw.println(line);
        }
        br.close();
        pw.close();
    }
}
