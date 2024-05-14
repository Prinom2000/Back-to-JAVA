
package lab_8_prob3;

import java.util.Random;
import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        // Create an array with 100 randomly chosen integers
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000); // Random integers up to 999
        }
        
        // Prompt the user to enter the index
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array (0-99): ");
        int index = scanner.nextInt();
        
        // Display the corresponding element value or handle out of bounds
        try {
            int value = array[index];
            System.out.println("Element value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}

