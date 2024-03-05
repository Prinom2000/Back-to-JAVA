/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class prob_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        // Create an array to store the strings
        String[] strings = new String[n];
        
        // Input the strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
        
        // Sort the strings lexicographically
        sortStrings(strings);
        
        // Display the sorted strings
        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }
        
        scanner.close();
    }
    
    // Method to sort strings lexicographically
    public static void sortStrings(String[] strings) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                if (strings[i].compareTo(strings[j]) > 0) {
                    // Swap strings
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
    }
}
