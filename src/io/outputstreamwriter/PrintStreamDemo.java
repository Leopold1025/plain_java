package io.outputstreamwriter;

import java.io.*;

/**
 * 使用字节打印流复制文本
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new FileReader("copy.java"));
        PrintStream ps = new PrintStream("printcopy2.java");
        String line;
        while ((line = br.readLine()) != null){
            ps.println(line);
        }
        br.close();
        ps.close();
    }
}
