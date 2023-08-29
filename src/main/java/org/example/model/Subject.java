package org.example.model;

/**
 * 专业类
 */
public class Subject {
    private String sujectName;
    private String subjectNo;
    private int subjectLife;

    public Subject() {

    }

    public Subject(String sujectName, String subjectNo, int subjectLife) {
        this.setSujectName(sujectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLife(subjectLife);
    }

    public String getSujectName() {
        return sujectName;
    }

    public void setSujectName(String sujectName) {
        this.sujectName = sujectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        if (subjectLife <= 0) {
            return;
        }
        this.subjectLife = subjectLife;
    }

    /**
     * 专业介绍的方法
     *
     * @return 专业介绍的信息
     */
    public String info() {
        String str = "专业信息如下：\n专业名称：" + this.getSujectName() + "\n专业编号：" + this.getSubjectNo()
                + "\n学制年限：" + this.getSubjectLife() + "年";
        return str;
    }

}