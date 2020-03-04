package collection.comparable.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test02 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();     // Java 7的钻石语法(构造器后面的尖括号中不需要写类型)
        list.add(new Student("Cao LUO", 33));
        list.add(new Student("DJ WANG", 32));
        list.add(new Student("Aruce LEE", 60));
        list.add(new Student("Bob YANG", 22));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());   //按名字比较
                return o1.getAge() - o2.getAge();   //按年龄比较
            }
        });

        for (Student stu : list) {
            System.out.println(stu);
        }
    }
}
