/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_8_prob4;

import java.util.Scanner;

// Custom exception for illegal triangle
class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }
}

// Abstract class GeometricObject
abstract class GeometricObject {
    private String color;
    private boolean filled;
    
    // Constructor
    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    // Accessor methods
    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public boolean isFilled() {
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}

// Triangle class extending GeometricObject
class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    
    // Constructors
    public Triangle() {
        super("No color", false); // super call kore perent class er sob nia nisi, then peremeter pass korshi.........
        
        side1 = side2 = side3 = 1.0;
    }
    
    public Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException {
        super(color, filled);
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Invalid triangle sides");
        }
        else{
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        
    }
    
    // Accessor methods
    public double getSide1() {
        return side1;
    }
    
    public double getSide2() {
        return side2;
    }
    
    public double getSide3() {
        return side3;
    }
    
    // Method to calculate area
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    // Method to calculate perimeter
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
    // Method to return string description
    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
    }
}


public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for triangle sides, color, and filled status
        System.out.print("Enter side1: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter color: ");
        String color = scanner.nextLine();
        System.out.print("Is the triangle filled (true/false): ");
        boolean filled = scanner.nextBoolean();
        
        try {
            // Create Triangle object
            Triangle triangle = new Triangle(side1, side2, side3, color, filled);
            
            // Display triangle details
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Color: " + triangle.getColor());
            System.out.println("Filled: " + triangle.isFilled());
        } catch (IllegalTriangleException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
