
package lab.pkg3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isValidPassword(String password) {
        // Check if the password length is at least eight characters
        if (password.length() < 8) {
            return false;
        }
        
        // Check if the password consists of only letters and digits
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
        }
        
        // Check if the password contains at least two digits
        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        
        return digitCount >= 2;
    }
}
    
