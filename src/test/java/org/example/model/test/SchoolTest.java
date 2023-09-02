package org.example.model.test;

import org.example.model.Student;
import org.example.model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        Subject sub1 = new Subject("计算机科学与应用", "J0001", 4);
        System.out.println(sub1.info());

        System.out.println("=================================");
        Student stu2 = new Student("2", "李四", "男", 18, sub1);
        System.out.println(stu2.introduction());

        sub1.addStudent(stu2);
        sub1.addStudent(stu2);
        sub1.addStudent(stu2);
        System.out.println(sub1.getStudentNum());
    }
}
