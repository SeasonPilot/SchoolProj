package org.example.model;

public class Student {
    private String studentNo;
    private String studentName;
    private String sex;
    private int age;
    private Subject subject;

    public Student() {
    }

    public Student(String studentNo, String studentName, String sex, int age) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setSex(sex);
        this.setAge(age);
    }

    public Student(String studentNo, String studentName, String sex, int age, Subject subject) {
        this.setStudentNo(studentNo);
        this.setStudentName(studentName);
        this.setSex(sex);
        this.setAge(age);
        this.setSubject(subject);
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 10 || age > 100)
            return;
        this.age = age;
    }

    public Subject getSubject() {

        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String introduction() {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo()
                + "\n性别：" + this.getSex() + "\n年龄：" + this.getAge() + "\n专业名称：" + this.getSubject().getSujectName()
                + "\n学制年限：" + this.getSubject().getSubjectLife() + "年";
        return str;
    }
}

