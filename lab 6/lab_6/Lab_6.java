/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */
public class Lab_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Faculty> faculties = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        while (true) {
            System.out.println("Main Menu:");
            System.out.println("a. Add");
            System.out.println("b. Delete");
            System.out.println("c. Update");
            System.out.println("d. Print");
            System.out.println("e. Search");
            System.out.println("Enter your choice (a-e):");
            char choice = scanner.next().charAt(0);
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 'a':
                    System.out.println("Add Menu:");
                    System.out.println("a. Add a Student");
                    System.out.println("b. Add a Course");
                    System.out.println("c. Add a Faculty");
                    char addChoice = scanner.next().charAt(0);
                    scanner.nextLine(); // Consume newline character

                    switch (addChoice) {
                        case 'a':
                            System.out.println("Enter Student ID:");
                            int studentId = scanner.nextInt();
                            scanner.nextLine(); // Consume newline character
                            System.out.println("Enter Student Name:");
                            String studentName = scanner.nextLine();
                            System.out.println("Enter Student CGPA:");
                            double studentCGPA = scanner.nextDouble();
                            students.add(new Student(studentId, studentName, studentCGPA));
                            break;
                        case 'b':
                            System.out.println("Enter Course ID:");
                            String courseId = scanner.nextLine();
                            System.out.println("Enter Course Title:");
                            String courseTitle = scanner.nextLine();
                            System.out.println("Enter Course Credit:");
                            double credit = scanner.nextDouble();
                            courses.add(new Course(courseId, courseTitle, credit));
                            break;
                        case 'c':
                            System.out.println("Enter Faculty ID:");
                            int facultyId = scanner.nextInt();
                            scanner.nextLine(); // Consume newline character
                            System.out.println("Enter Faculty Name:");
                            String facultyName = scanner.nextLine();
                            System.out.println("Enter Faculty Position:");
                            String facultyPosition = scanner.nextLine();
                            faculties.add(new Faculty(facultyId, facultyName, facultyPosition));
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 'b':
                    System.out.println("Delete Menu:");
                    System.out.println("a. Delete a Student");
                    System.out.println("b. Delete a Course");
                    System.out.println("c. Delete a Faculty");
                    char deleteChoice = scanner.next().charAt(0);
                    scanner.nextLine(); // Consume newline character

                    switch (deleteChoice) {
                        case 'a':
                            // Implement logic to delete a student
                            break;
                        case 'b':
                            // Implement logic to delete a course
                            break;
                        case 'c':
                            // Implement logic to delete a faculty
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    break;
                case 'c':
                    // Similar logic for Update
                    break;
                case 'd':
                    // Similar logic for Print
                    break;
                case 'e':
                    // Similar logic for Search
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    
}
