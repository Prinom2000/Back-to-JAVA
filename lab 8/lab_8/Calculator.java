/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_8;

/**
 *
 * @author User
 */
class Calculator {
    private int num1;
    private int num2;
    
    // Constructor
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Method to perform addition
    public int add() {
        if (num1 < 0 || num2 < 0) {
//            throw new ArithmeticException("Negative numbers not allowed for addition");
        }
        return num1 + num2;
    }
    
    // Method to perform subtraction
    public int subtract() {
        if (num1 < 0 || num2 < 0) {
//            throw new ArithmeticException("Negative numbers not allowed for subtraction");
        }
        return num1 - num2;
    }
    
    // Method to perform multiplication
    public int multiply() {
        if (num1 == 0 || num2 == 0) {
//            throw new ArithmeticException("Zero not allowed for multiplication");
        }
        return num1 * num2;
    }
    
    // Method to perform division
    public int division() {
        if (num2 == 0) {
//            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2;
    }
}
