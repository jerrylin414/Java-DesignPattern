package com.lzy.designpattern.lod.error;

/**
 * @auther jerry
 * @date 4/2/2025 10:57 AM
 */

//Law of Demeter
public class Error {
    //will show the error example
    public static void main(String[] args) {
        School school = new School();
        school.getTeacher().getStudent().study(); //Do not call other class
    }
}

class School{
    private Teacher teacher;
    public Teacher getTeacher(){
        return teacher;
    }
}

class Teacher{
    private Student student;
    public Student getStudent(){
        return student;
    }
}

class Student{
    public void study(){
        System.out.println("study");
    }
}
