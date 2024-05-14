/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_8;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        try {
            // Declare four objects of Calculator class
            Calculator obj1 = new Calculator(5, 3);
            Calculator obj2 = new Calculator(10, 7);
            Calculator obj3 = new Calculator(-2, 4); // Example of negative number for subtraction
            Calculator obj4 = new Calculator(8, 0);  // Example of division by zero

            // Perform addition, subtraction, multiplication, and division operations
            System.out.println("Addition Result: " + obj1.add());
            System.out.println("Subtraction Result: " + obj2.subtract());
            System.out.println("Multiplication Result: " + obj3.multiply());
            System.out.println("Division Result: " + obj4.division());
        } catch (ArithmeticException e) {
            System.out.println("Vul: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error: Non-integer input provided.");
        }
    }
}
