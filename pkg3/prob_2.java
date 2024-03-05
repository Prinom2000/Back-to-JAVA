
package lab.pkg3;

public class prob_2 {
        public static void main(String[] args) {
        int[][] workHours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };
        
        // Array to store the total hours for each employee
        int[] totalHours = new int[workHours.length];
        
        // Calculate total hours for each employee
        for (int i = 0; i < workHours.length; i++) {
            int sum = 0;
            for (int j = 0; j < workHours[i].length; j++) {
                sum += workHours[i][j];
            }
            totalHours[i] = sum;
        }
        
        // Sort employees and their total hours in decreasing order
        sortEmployeesByTotalHours(workHours, totalHours);
        
        // Display employees and their total hours in decreasing order
        System.out.println("Employee\tTotal Hours");
        for (int i = 0; i < workHours.length; i++) {
            System.out.println("Employee " + (i + 1) + "\t\t" + totalHours[i]);
        }
    }
    
    // Method to sort employees and their total hours in decreasing order
    public static void sortEmployeesByTotalHours(int[][] workHours, int[] totalHours) {
        for (int i = 0; i < totalHours.length - 1; i++) {
            for (int j = 0; j < totalHours.length - i - 1; j++) {
                if (totalHours[j] < totalHours[j + 1]) {
                    // Swap total hours
                    int tempTotalHours = totalHours[j];
                    totalHours[j] = totalHours[j + 1];
                    totalHours[j + 1] = tempTotalHours;
                    
                    // Swap work hours
                    int[] tempWorkHours = workHours[j];
                    workHours[j] = workHours[j + 1];
                    workHours[j + 1] = tempWorkHours;
                }
            }
        }
    }
}


