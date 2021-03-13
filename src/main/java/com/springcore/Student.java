package com.springcore;

public class Student {

    private String studentName;
    private int studentId;
    private String studentAddress;


    public Student(String studentName, int studentId, String studentAddress) {
        setStudentName(studentName);
        setStudentId(studentId);
        setStudentAddress(studentAddress);
    }


    public Student() {
    }

    @Override
    public String toString() {
        return studentName+" ("+studentId+")"+ studentAddress;
    }
    



    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentAddress() {
        return this.studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    

    
}
