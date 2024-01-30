
package Input;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.print("Enter a number: ");
        num=input.nextInt();
        
        String name;
        System.out.print("Enter ur name: ");
        name= input.nextLine();
        
        
        System.out.print("Number: "+ num);
        System.out.print("Name: "+ name);
        
        
        
        
    }
}
