package io.objectinputstream;

import java.io.*;
import java.util.ArrayList;

/**
 * 使用对象输出流写对象和对象输入流读对象
 * 解决读取对象出现异常的问题,使用集合类
 */
public class ObjectOperate2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        listMethod();
        //创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("b.txt"));
        //读取数据
        Object o = ois.readObject();
//        System.out.println(o);
        //向下转型
        ArrayList<Student> list = (ArrayList<Student>) o;
        for (Student student : list) {
            System.out.println(student);
        }
        //释放资源
        ois.close();
    }

    /**
     * 写出集合对象
     */
    public static void listMethod() throws IOException {
        //创建对象输出流的对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("b.txt"));
        //创建集合类
        ArrayList<Student> list = new ArrayList<>();
        //添加学生对象
        list.add(new Student("zhangsan", 20));
        list.add(new Student("lisi", 30));
        //写出集合对象
        oos.writeObject(list);
        //释放资源
        oos.close();
    }
}
