/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */
public class Course {
    private String courseId;
    private String courseTitle;
    private double credit;
    private List<Student> studentList;
    private int numberOfStudents;
    private Faculty faculty;

    public Course() {
        studentList = new ArrayList<>();
        numberOfStudents = 0;
    }

    public Course(String courseId, String courseTitle, double credit) {
        this();
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.credit = credit;
    }

    public void addStudent(Student student) {
        studentList.add(student);
        numberOfStudents++;
    }

    public void dropStudent(int studentId) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.studentId == studentId) {
                iterator.remove();
                numberOfStudents--;
                break;
            }
        }
    }

    public void addFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void dropFaculty() {
        this.faculty = null;
    }

    public void printStudentList() {
        System.out.println("Students enrolled in course " + courseId + ":");
        for (Student student : studentList) {
            System.out.println(student.display());
        }
    }

    public String toString() {
        return "Course ID: " + courseId + ", Title: " + courseTitle + ", Credit: " + credit;
    }
}
