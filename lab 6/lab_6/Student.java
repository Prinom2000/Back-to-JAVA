/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_6;

/**
 *
 * @author User
 */
public class Student {
    int studentId;
    private String studentName;
    private double studentCGPA;

    public Student() {}

    public Student(int studentId, String studentName, double studentCGPA) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCGPA = studentCGPA;
    }

    public String display() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", CGPA: " + studentCGPA;
    }
}
