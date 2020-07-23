package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setfIO("ФИО");
        student.setGroup("some group");
        student.setEnrolled(new Date());

        System.out.println(student.getfIO() + " enrolled " + student.getGroup() + " in " + student.getEnrolled());
    }
}
