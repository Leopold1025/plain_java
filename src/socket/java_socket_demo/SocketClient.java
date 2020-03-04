package socket.java_socket_demo;

import java.io.*;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) {
        try {
            //创建客户端socket
            Socket socket = new Socket("localhost", 8088);
            //要发送给服务器的信息
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("客户端发送信息");
            pw.flush();
            //关闭输出流
            socket.shutdownOutput();
            //从服务器接收的消息
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);  //转换流
            BufferedReader br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null){
                System.out.println("我是客户端，服务器返回信息：" + info);
            }
            //释放资源
            br.close();
            isr.close();
            is.close();
            os.close();
            pw.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
