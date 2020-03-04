package io.objectinputstream;

import java.io.*;

/**
 * 使用对象输出流写对象和对象输入流读对象
 */
public class ObjectOperate {
    public static void main(String[] args) throws IOException {
        writeObject();
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        //读取对象
        try {
            while (true) {
                Object obj = ois.readObject();
                System.out.println(obj);
            }
        } catch (Exception e) {
            System.out.println("读到了文件末尾");
        }
        //释放资源
        ois.close();
    }

    /***
     * 写对象
     * @throws IOException
     */
    public static void writeObject() throws IOException {
        //创建对象输出流的对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        //创建学生对象
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 30);
        Student s3 = new Student("王五", 10);
        //写出学生对象
        oos.writeObject(s1);
        oos.writeObject(s2);
        oos.writeObject(s3);
        //释放资源
        oos.close();
    }
}
