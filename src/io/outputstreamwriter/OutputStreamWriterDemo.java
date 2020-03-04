package io.outputstreamwriter;

import java.io.*;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建输入流
        BufferedReader br = new BufferedReader(new FileReader("copy.java"));
        //创建输出流
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = br.readLine()) != null){
            bw.write(line);
            bw.write("\r\n");
        }
        //释放资源
        br.close();
        bw.close();
    }
}
