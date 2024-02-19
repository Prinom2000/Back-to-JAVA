
package lab2.prac;

import java.util.Random;

public class Lab2Prac {

    public static void main(String[] args) {
        int s=100;
        int [] arr =new int[s];
        Random rand = new Random();
        for (int i = 0; i < s; i++) {
            arr[i] = rand.nextInt(1000); // Generate random integers between 0 and 999
        }
        for (int i = 0; i < s; i++) {
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();

        // Find highest element
        int highestValue = findHighest(arr);
        int highestIndex = findIndex(arr, highestValue);

        // Find smallest element
        int smallestValue = findSmallest(arr);
        int smallestIndex = findIndex(arr, smallestValue);

        // Output results
        System.out.println("Highest Element: " + highestValue + " at index " + highestIndex);
        System.out.println("Smallest Element: " + smallestValue + " at index " + smallestIndex);
    }
    
    // Method to find highest element in array
    public static int findHighest(int[] arr) {
        int highest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        return highest;
    }

    // Method to find smallest element in array
    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }

    // Method to find index of given value in array
    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1; // If value not found in array
    }
    
    
}



