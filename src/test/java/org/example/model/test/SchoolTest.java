package org.example.model.test;

import org.example.model.Subject;

public class SchoolTest {
    public static void main(String[] args) {
        Subject sub1 = new Subject("计算机科学与应用", "J0001", 4);
        System.out.println(sub1.info());
    }
}
