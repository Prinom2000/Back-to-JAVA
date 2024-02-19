/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.prac;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class lab_2_prob_6 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create arrays to store names and scores
        String[] names = new String[numStudents];
        int[] scores = new int[numStudents];

        // Prompt the user to enter names and scores for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
            scanner.nextLine(); // Consume newline
        }

        // Sort the students' names in decreasing order of their scores
        sortStudentsByScore(names, scores);

        // Print the names in decreasing order of scores
        System.out.println("\nStudents in decreasing order of their scores:");
        for (int i=0; i<scores.length; i++) {
            System.out.println(names[i]+" -- "+ scores[i]);
        }
            
        }
        
        // Method to sort students' names by their scores in decreasing order
    public static void sortStudentsByScore(String[] names, int[] scores) {
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j] < scores[j + 1]) {
                    // Swap scores
                    int tempScore = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScore;

                    // Swap names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}
