package com.lzy.designpattern.lod.right;

/**
 * @auther jerry
 * @date 4/2/2025 11:03 AM
 */
public class Right {
    public static void main(String[] args) {
        School school = new School();
        school.letStudentStudy(); //
    }
}

class School{
    private Teacher teacher;
    public void letStudentStudy(){
        teacher.letStudentStudy();
    }
}

class Student{
    public void study(){
        System.out.println("study");
    }
}

class Teacher{
    private Student student;
    public void letStudentStudy(){
        student.study();
    }
}