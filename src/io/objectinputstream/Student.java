package io.objectinputstream;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 8735607654374793635L;
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
