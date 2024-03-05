
package lab.pkg3;

import java.util.Arrays;
import java.util.Comparator;


public class prob_5 {
    public static void main(String[] args) {
        int[][] array = {
            {3, 5, 1},
            {9, 2, 4},
            {7, 8, 6}
        };
        
        // Column index to sort by (0-based index)
        int columnToSortBy = 1; // Sorting based on the second column
        
        // Sort the array based on the values in the specified column
        sortTwoDimensionalArrayByColumn(array, columnToSortBy);
        
        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    // Method to sort a two-dimensional array by the values in a specified column
    public static void sortTwoDimensionalArrayByColumn(int[][] array, int columnIndex) {
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(final int[] row1, final int[] row2) {
                // Compare the values in the specified column
                return Integer.compare(row1[columnIndex], row2[columnIndex]);
            }
        });
    }
}
