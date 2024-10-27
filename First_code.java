/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package first_code;

import java.util.Scanner;
public class First_code {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Prinom Mojumder");
        
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        
        System.out.println(myText+ "Prinom. You Got:"+myNum);
        System.out.print("Enter: ");
        Scanner obj= new Scanner(System.in);
        int n= obj.nextInt();
        System.out.println(n);
    }
    
}
